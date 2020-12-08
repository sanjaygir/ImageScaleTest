<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 12/8/2020
  Time: 11:23 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>





<g:uploadForm action="resize">
    <fieldset class="form">

        <h3> Upload Template Image </h3>



        <table>


            <tr>
                <td>
                    File
                </td>

                <td>
                    <input type="file" accept=".jpg" name="file" />

                    <br>

                    <i style="font-size: 0.9em;">(Image file should be a .jpg file in rgb format)</i>

                </td>
            </tr>



            <tr>
                <td>
                    <g:submitButton name="upload" class="button" value="Preview" style="cursor: pointer;" />




                </td>

                <td>


                </td>
            </tr>

        </table>



    </fieldset>



</g:uploadForm>



</body>
</html>