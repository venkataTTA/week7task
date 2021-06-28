
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Login Page</title>
    </head>
    <body>
    <center>
        <h1>Welcome to Students!</h1>
        <form action="StudentServlet"  method="POST">
            <table border="1" cellspacing="10" cellpadding="3">
              <tbody>
                    <tr>
                     <td>Student Id</td>
                        <td><input type="text" name="sid" value="" /></td>
                       
                    </tr>
                    <tr>
                    <td>FirstName</td>
                        <td><input type="text" name="FirstName" value="" /></td>
                       
                    </tr>
                    <tr>
                        <td>LastName</td>
                         <td><input type="text" name="LastName" value="" /></td>
                       
                    </tr>
                    <tr>
                       <td>score</td>
                        <td><input type="text" name="score" value="" /></td>
                        
                    </tr>
                    <tr>
                    
                        <td><input type="submit" value="Login" /></td>                        
                       <td><input type="reset" value="Clear" /></td>
                        
                    </tr>
                </tbody>
            </table>

            
        </form>
    </center>
        
    </body>
</html>
