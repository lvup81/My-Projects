<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="index.css">
    </head>
    </body>
        <h2> Welcome to Telusko </h2>

         <form action="addAlien">
                <label for="aid">Enter Id :</label>
                <input type="text" id="aid" name="aid"><br>
                <label for="aname">Enter Name:</label>
                <input type="text" id="aname" name="aname"><br>
                <label for="acourse">Enter Course:</label>
                <select id="acourse" name="acourse">
                    <option>Java</option>
                    <option>C+</option>
                    <option>Block Chain</option>
                    <option>Python</option>
                </select>
                <input type="submit" value="Submit">
            </form>

    </body>
</html>