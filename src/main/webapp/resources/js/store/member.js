var member = member || {}
member = (function(){
	let _
	let init = function(){
		 _ = sessionStorage.getItem('context')
	}
	let join = function(){
		$.ajax({
			url : _+`/person/users`,
			type: 'POST',
			data: $("#joinForm").serialize(),
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
	let login = function(){}
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('ctx')
		sessionStroage.removeItem('js')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('img')
	}
	return {init, join, login, logout}
})()