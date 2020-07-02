var member = member || {}
member = (function(){
	let _
	let init = function(){
		 _ = sessionStorage.getItem('context')
		 javascript = sessionStorage.getItem('javascript'),
		 session = sessionStorage.getItem('session')
		 console.log(_)
		 console.log(javascript)
		 console.log(session)
	}
	let join = function(payload){
		$.ajax({
			url : _+`/person/users`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				if(res === 'SUCCESS'){
					console.log(res)
					location.href = _+`/members/login/form`					
				} else {
					console.log(res)
					location.href = _+`/members/join/form`
				}
			},
			error: function(err){
				console.log(err)
			}
		})
	}
	let login = function(payload){
		$.ajax({
			url : _+`/person/users/${payload.email}`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				console.log(res)
			},
			error: function(err){
				console.log(err)
			}
		})
	}
	let logout = function(){
		sessionStroage.removeItem('name')
		sessionStroage.removeItem('ctx')
		sessionStroage.removeItem('js')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('img')
		location.href = _+`/`
	}
	let remove = function(){
		$.ajax()
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
		location.href = _+`/`
	}
	return {init, join, login, logout}
})()