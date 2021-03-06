<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header
	class="v-sheet v-sheet--tile theme--dark v-toolbar v-app-bar v-app-bar--fixed black"
	data-booted="true"
	style="height: 64px; margin-top: 0px; transform: translateY(0px); left: 256px; right: 0px;">
	<div class="v-toolbar__content" style="height: 64px;">
		<button type="button"
			class="v-app-bar__nav-icon v-btn v-btn--flat v-btn--icon v-btn--round theme--dark v-size--default">
			<span class="v-btn__content"><i aria-hidden="true"
				class="v-icon notranslate mdi mdi-menu theme--dark"></i></span>
		</button>
		<a id="all_of_bicycle_btn"
			class="router-link-exact-active router-link-active"
			aria-current="page"><div class="v-toolbar__title">ALL of
				Bicycle</div></a>
		<div class="spacer"></div>
		<button type="button"
			class="v-btn v-btn--flat v-btn--icon v-btn--round theme--dark v-size--default">
			<span class="v-btn__content"><i aria-hidden="true"
				class="v-icon notranslate mdi mdi-magnify theme--dark"></i></span>
		</button>
		<div role="dialog" class="v-dialog__container">
			<!---->
		</div>
		<c:choose>
			<c:when test="${ empty session }">
				<button id="login_btn" type="button"
					class="v-btn v-btn--flat v-btn--icon v-btn--round theme--dark v-size--default"
					role="button" aria-haspopup="true" aria-expanded="false">
					<span class="v-btn__content"><div class="v-avatar"
							style="height: 48px; min-width: 48px; width: 48px;">
							<i aria-hidden="true"
								class="v-icon notranslate mdi mdi-account-circle theme--dark"></i>
						</div></span>
				</button>
			</c:when>
			<c:when test="${ session.accessCode eq 'admin' }">
				<button id="accountOut_btn" type="button"
					class="v-btn v-btn--flat v-btn--icon v-btn--round theme--dark v-size--default"
					role="button" aria-haspopup="true" aria-expanded="false">
					<span class="v-btn__content"><div class="v-avatar"
							style="height: 48px; min-width: 48px; width: 48px;">
							<a>A</a>
						</div></span>
				</button>
			</c:when>
			<c:otherwise>
				<button id="accountOut_btn" type="button"
					class="v-btn v-btn--flat v-btn--icon v-btn--round theme--dark v-size--default"
					role="button" aria-haspopup="true" aria-expanded="false">
					<span class="v-btn__content"><div class="v-avatar"
							style="height: 48px; min-width: 48px; width: 48px;">
						<a>U</a>
						</div></span>
				</button>
			</c:otherwise>
		</c:choose>

		<div class="v-menu"></div>
		<button type="button"
			class="v-btn v-btn--flat v-btn--icon v-btn--round theme--dark v-size--default">
			<span class="v-btn__content"><i aria-hidden="true"
				class="v-icon notranslate mdi mdi-dots-vertical theme--dark"></i></span>
		</button>
	</div>
</header>
<script>
$('#login_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/members/login/form"
})
/* document.getElementById('accountOut_btn').addEventListener('click', function(e){
	e.preventDefault()
	member.init()
	member.logout()
}) */
</script>