<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
	<head>
 		<title>下载文件显示页面</title>
 	</head> 
 
	<body>
		<!-- 遍历map集合 -->
		<c:forEach items="${fileNameMap }" var="me">
			<c:url value="/DownloadServlet" var="downurl">
				<c:param name="filename" value="${me.key }"></c:param>
			</c:url>
			${me.value }<a href="${downurl }">下载</a><br>
		</c:forEach>
	</body>
</html>