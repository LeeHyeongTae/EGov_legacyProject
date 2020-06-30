"use strict"
var app = app || {}
app = (()=>{
	return {init(x){app.$.init(x)},
		onCreate(){
		$.when($.getScript($.js()+'/store/index.js'))
		.done(alert('스토어 인덱스 호출 성공.'))
		.fail(alert('자바스크립트 초기화 실패.'))
	}
	}
			
})();

app.$ = {
		init : (x) => {
			$.getScript(x+'/resources/js/session.js', ()=>{
				$.extend(new Session(x))
				app.onCreate()
			})
		}
	}