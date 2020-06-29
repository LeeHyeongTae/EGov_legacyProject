<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
<!-- head -->
<tiles:insertAttribute name="tamphead"/>
<body>
 <!-- navi -->
<tiles:insertAttribute name="tampnavigator"/>
<!-- content -->
<tiles:insertAttribute name="tampcontent"/>
<!-- footer -->
<tiles:insertAttribute name="tampfooter"/>
</body>
</html>