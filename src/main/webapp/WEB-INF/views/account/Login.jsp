<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div role="document" class="v-dialog__content v-dialog__content--active"
	style="z-index: 202;" tabindex="0">
	<div class="v-dialog v-dialog--active v-dialog--persistent"
		style="transform-origin: center center; max-width: 500px;">
		<div class="container">
			<div class="elevation-12 v-card v-sheet theme--light">
				<header
					class="v-sheet v-sheet--tile theme--dark v-toolbar v-toolbar--flat primary"
					style="height: 64px;">
					<div class="v-toolbar__content" style="height: 64px;">
						<div class="v-toolbar__title">Login</div>
						<div class="spacer"></div>
					</div>
				</header>
				<div class="v-card__text">
					<form novalidate="novalidate" class="v-form">
						<div
							class="v-input theme--light v-text-field v-text-field--is-booted">
							<div class="v-input__prepend-outer">
								<div class="v-input__icon v-input__icon--prepend">
									<i aria-hidden="true"
										class="v-icon notranslate mdi mdi-account theme--light"></i>
								</div>
							</div>
							<div class="v-input__control">
								<div class="v-input__slot">
									<div class="v-text-field__slot">
										<label for="loginEmailText" class="v-label theme--light"
											style="left: 0px; right: auto; position: absolute;">E-mail</label><input
											name="login" id="loginEmailText" type="text">
									</div>
								</div>
								<div class="v-text-field__details">
									<div class="v-messages theme--light">
										<div class="v-messages__wrapper"></div>
									</div>
								</div>
							</div>
						</div>
						<div
							class="v-input theme--light v-text-field v-text-field--is-booted">
							<div class="v-input__prepend-outer">
								<div class="v-input__icon v-input__icon--prepend">
									<i aria-hidden="true"
										class="v-icon notranslate mdi mdi-lock theme--light"></i>
								</div>
							</div>
							<div class="v-input__control">
								<div class="v-input__slot">
									<div class="v-text-field__slot">
										<label for="loginPassword" class="v-label theme--light"
											style="left: 0px; right: auto; position: absolute;">Password</label><input
											name="password" id="loginPassword" type="password">
									</div>
								</div>
								<div class="v-text-field__details">
									<div class="v-messages theme--light">
										<div class="v-messages__wrapper"></div>
									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
				<div class="v-card__actions">
					<div class="spacer"></div>
					<button type="button"
						class="v-btn v-btn--contained theme--light v-size--default teal">
						<span id="loginForm_join_btn" class="v-btn__content">Join</span>
					</button>
					<button type="button"
						class="v-btn v-btn--contained theme--light v-size--default primary">
						<span id="loginForm_login_btn" class="v-btn__content">Login</span>
					</button>
					<button type="button"
						class="v-btn v-btn--contained theme--light v-size--default gray">
						<span id="loginForm_cancel" class="v-btn__content">Cancel</span>
					</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="${javascript}/store/member.js"></script>
<script>
	$('#loginForm_join_btn').click(function(e) {
		e.preventDefault()
		location.href = "${context}/members/join/form"
	})
	document
			.getElementById('loginForm_login_btn')
			.addEventListener(
					'click',
					function(e) {
						e.preventDefault()
						member.init()
						member.login({
									"email" : document.getElementById('loginEmailText').value,
									"password" : document.getElementById('loginPassword').value
								})
					})
</script>