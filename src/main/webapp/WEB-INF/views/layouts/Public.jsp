<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
<head>
<tiles:insertAttribute name="head"/>
</head>
<body>
<div data-app="true"
		class="v-application v-application--is-ltr theme--light" id="inspire">
	<div class="v-application--wrap">
		<tiles:insertAttribute name="navigator"/>
		<tiles:insertAttribute name="header"/>
		<tiles:insertAttribute name="content"/>
		<tiles:insertAttribute name="footer"/>
	</div>	
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/vue@2.x/dist/vue.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vuetify@2.x/dist/vuetify.js"></script>
<script>
    new Vue({
      /* el: '#app', */
      vuetify: new Vuetify(),
    })
</script>
<script>
$('#login_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/members/login/form"
})
$('#joinForm_cancel').click(function(e){
	e.preventDefault()
	location.href = "${context}/"
})
$('#loginForm_cancel').click(function(e){
	e.preventDefault()
	location.href = "${context}/"
})
$('#all_of_bicycle_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/"
})
$('#navi_home_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/"
})
$('#navi_intro_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/bicycle/intro"
})
$('#navi_history_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/bicycle/history"
})
$('#navi_infomation_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/bicycle/infomation"
})
$('#navi_bicycleList_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/bicycle/list"
})
$('#navi_links_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/bicycle/link"
})
$('#navi_board_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/bicycle/board"
})
</script>
</html>