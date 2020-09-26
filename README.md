# hw1-helloMVC



## controller -  DoLogin,  DoRegister, Home

    DoLogin
		- id, password를 넘겨 받아서 로그인 성공 및 로그인 실패 판단

    DoRegister
   	- 등록할 때 필요한 값들을 입력받아 customer 객체를 생성
        Home
   	- loginform.jsp / registerform.jsp 로 이동 가능

## model - Customer
    id, password, name, gender, email 값을 가지고 있는 객체 기본생성자
    

## service
    CustomerService
		- addCustomer는 유저 추가


## view - error, loginFail, loginSuccess, registerForm, registerSuccess

    loginSuccess
    	- 사용자의 id, name, email 표시

    registerSuccess
		-  a 링크 태그를 통해 홈으로 이동 가능

    registerForm
    	- 회원가입에 필요한 정보를 입력 받아 doRegister로 전송
