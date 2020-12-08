package imagescaletest

import org.imgscalr.Scalr

import javax.imageio.ImageIO
import java.awt.image.BufferedImage

class HomeController {

    def index() {




    }


    def resize(){

        def file = request.getFile("file")


        InputStream imageStream
        BufferedImage bi
        try{
            imageStream = file?.getInputStream()
            bi = ImageIO.read(imageStream)
        }
        catch(IllegalArgumentException e){
            return null
        }
        catch(IOException e){
            return null
        }
        finally{
            imageStream?.close()
        }


        BufferedImage img = bi

        /*
        try {
            img = ImageIO.read(new File("rose.jpg"));
        } catch (IOException e) {

            println "Error loading image"
        }
*/

        def op = new java.awt.image.ColorConvertOp(java.awt.color.ColorSpace.getInstance(java.awt.color.ColorSpace.CS_sRGB), null)

        img  = Scalr.resize(img, Scalr.Method.AUTOMATIC, Scalr.Mode.FIT_TO_HEIGHT, 100, op)


        response.setContentType("application/octet-stream")
        response.setHeader('Content-disposition', 'Attachment; filename=resized.jpg')

        OutputStream os = response.getOutputStream();
        ImageIO.write(img, "jpeg", os);
        os.flush()
        os.close();


        render "Hello"


    }
}
