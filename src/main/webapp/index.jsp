<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Employee Registration Form</title>
</head>
<body>
	<h1>Employee Registration Form</h1>
    <h2>Please fill the data below</h2>
    <form action="<%= request.getContextPath() %>/RegisterServlet" method="POST" name="registerForm">
    
        <div>
            <label for="company">Company:</label>
            <input type="text" id="company" name="company" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="payroll">Pay Roll #:</label>
            <input type="number" id="payroll" name="payroll" required pattern="[0-9]+" title="Field can only contain numeric characters"><br><br>

            <label for="fullName">Full Name:</label>
            <input type="text" id="fullName" name="fullName" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="reference">Reference Indicator:</label>
            <input type="text" id="reference" name="reference" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="jobtitle">Job Title:</label>
            <input type="text" id="jobTitle" name="jobTitle" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="workFunction">Function:</label>
            <input type="text" id="workFunction" name="workFunction" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>
        </div>

        <div>
            <label for="workSubFunction">Sub Function:</label>
            <input type="text" id="workSubFunction" name="workSubFunction" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="sector">Sector:</label>
            <input type="text" id="sector" name="sector" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="location">Location:</label>
            <input type="text" id="location" name="location" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="building">Building:</label>
            <input type="text" id="building" name="building" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="room">Room #:</label>
            <input type="text" id="room" name="room" required pattern="[a-zA-Z0-9]+" title="Field can only contain alphanumeric characters"><br><br>

            <label for="requesterTel">Requester Tel #:</label>
            <input type="number" id="requesterTel" name="requesterTel" required pattern="[0-9]+" title="Field can only contain numeric characters"><br><br>
        </div>

        <div>
            <input type="checkbox" id="confirmation" name="confirmation" required>
            <label for="confirmation">I have filled all the requested data and all information is correct.</label><br><br>

            <input type="submit" value="Send">
        </div>
        
    </form>
</body>
</html>
