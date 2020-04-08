<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">

        First Name: <form:input path="firstName" />
        <br/>
        Last Name: <form:input path="lastName" />
        <form:errors path="lastName" />
        <br />
        Age: <form:input path="age" />
                <form:errors path="age" />

         <br/>
         Course Code: <form:input path="courseCode" />
        <form:errors path="courseCode" />
        <br/>
        Country: 
        <form:select path="country">
            <form:options items="${student.listOfCountries}" />
            <%-- <form:option value="Brazil" label="Brazil"></form:option>
            <form:option value="India" label="India"></form:option>
            <form:option value="England" label="England"></form:option>
            <form:option value="France" label="France"></form:option> --%>

        </form:select>

        Java <form:radiobutton path="favouriteCodeLanguage" value="Java" />
        C#<form:radiobutton path="favouriteCodeLanguage" value="C#"/>
        Ruby <form:radiobutton path="favouriteCodeLanguage" value="Ruby"/>
        Python <form:radiobutton path="favouriteCodeLanguage" value="Python"/>
      
        <input type="submit" value="submit"/>
    </form:form>
</body>
</html>