<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div role="document" tabindex="0"
	class="v-dialog__content v-dialog__content--active"
	style="z-index: 202;">
	<div class="v-dialog v-dialog--active v-dialog--persistent"
		style="transform-origin: center center; max-width: 500px;">
		<div class="container">
			<div class="v-card v-sheet theme--light">
				<header
					class="v-sheet v-sheet--tile theme--dark v-toolbar v-toolbar--flat primary"
					style="height: 64px;">
					<div class="v-toolbar__content" style="height: 64px;">
						<div class="v-toolbar__title">Join</div>
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
										<label for="nameText" class="v-label theme--light"
											style="left: 0px; right: auto; position: absolute;">Name</label>
											<input
											name="name" id="join_nameText" type="text">
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
										class="v-icon notranslate mdi mdi-email theme--light"></i>
								</div>
							</div>
							<div class="v-input__control">
								<div class="v-input__slot">
									<div class="v-text-field__slot">
										<label for="emailText" class="v-label theme--light"
											style="left: 0px; right: auto; position: absolute;">E-mail</label>
											<input
											name="email" id="join_emailText" type="text">
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
										<label for="passwordText" class="v-label theme--light"
											style="left: 0px; right: auto; position: absolute;">Password</label>
											<input
											name="password" id="join_passwordText" type="password">
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
							class="v-input theme--light v-input--selection-controls v-input--checkbox">
							<div class="v-input__control">
								<div class="v-input__slot">
									<div class="v-input--selection-controls__input">
										<i aria-hidden="true"
											class="v-icon notranslate mdi mdi-checkbox-blank-outline theme--light"></i>
											<input
											aria-checked="false" id="input-104" role="checkbox"
											type="checkbox" required="required" value="">
										<div class="v-input--selection-controls__ripple"></div>
									</div>
									<label for="input-104" class="v-label theme--light"
										style="left: 0px; right: auto; position: relative;">Do
										you agree?</label>
								</div>
								<div class="v-messages theme--light">
									<div class="v-messages__wrapper"></div>
								</div>
							</div>
						</div>
					</form>
				</div>
				<div class="v-card__actions">
					<button type="button" id="joinForm_submit_btn"
						class="mr-4 v-btn v-btn--contained theme--light v-size--default light-green">
						<span class="v-btn__content">submit</span>
					</button>
					<button type="button"
						class="v-btn v-btn--contained theme--light v-size--default amber">
						<span class="v-btn__content">clear</span>
					</button>
					<div class="spacer"></div>
					<button type="button"
						class="v-btn v-btn--contained theme--light v-size--default primary">
						<span id="joinForm_login_btn" class="v-btn__content">Login</span>
					</button>
					<button type="button"
						class="v-btn v-btn--contained theme--light v-size--default gray">
						<span id="joinForm_cancel" class="v-btn__content">Cancel</span>
					</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#joinForm_login_btn').click(function(e){
	e.preventDefault()
	location.href = "${context}/members/login/form"
})
/* document.getElementById('joinForm_submit_btn').addEventListener('click', function(e){
	e.preventDefault()
	member.init()
	member.join({"userid": documentById('join_nameText').value,})
}) */
$('#joinForm_submit_btn').click(function(e){
	console.log('submit btn click')
	e.preventDefault()
	$.ajax({
		url: '${context}/person/users',
		type: 'post',
		data: JSON.stringify({
			seq: '10',
			name: 'name',
			email: 'email',
			password: 'passwd'
		}),
		dataType:'json',
		contentType:'application/json',
		success:function(res){
			console.log(res)
			location.href = "${context}/members/login/form"
		},
		error:function(req, status, err){
			console.log(req.status)
		}
	})
})
</script>