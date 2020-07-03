<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<div id="user_list">
	<!-- items:리스트가 받아올 배열 이름, var:for문 내부에서 사용할 변수, varStatus: 상태용 변 -->
	<%--     <p>${status.count} : <c:out value="${name}" /></p> --%>
	<table id="userlist_table">
		<tr>
			<th>No.</th>
			<th>Email</th>
			<th>Name</th>
		</tr>
	<c:forEach var="member" items="${members}" varStatus="status">
		<tr>
			<td>`${ status.count }`</td>
			<td>`${ member.email }`</td>
			<td>`${ member.name }`</td>
		</tr>
	</c:forEach>
	</table>
</div>
<script src="${javascript}/store/person.js"></script>
<script>

</script>
<style>
#userlist_table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#userlist_table td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

#userlist_table tr:nth-child(even) {
	background-color: #dddddd;
}
</style>