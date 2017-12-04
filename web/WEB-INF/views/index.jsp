<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

<c:if test="${not empty resultObject}">

  <ul>
    <c:forEach var="listValue" items="${resultObject}">
      <li>${listValue}</li>
    </c:forEach>
  </ul>

</c:if>
</body>
</html>
