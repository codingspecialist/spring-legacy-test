# 스프링레거시 연습
 
## 1. @Controller
- 해당 어노테이션은  Spring-Context에 Controller 객체를 저장해준다.
- 해당 어노테이션이 있는 클래스는 디스패처가 찾을 수 있는 객체이다.
- 해당 어노테이션이 있는 클래스의 메소드는 ViewResolver가 관여한다.

## 2. @RequestMapping
- 해당 어노테이션은 디스패처가 찾아야할 URL을 등록하는 곳이다.
- 지원 메소드는 GET, POST, PUT, DELETE 이다.

## 3. @RequestParam
- 해당 어노테이션은 QueryString과 MIME-Type : x-www-form-urlencoded 데이터를 받아준다.
- request.getParameter() 함수와 동일한 역할을 한다.

## 4. @RequestBody
- 해당 어노테이션은 raw 데이터를 받을 때 사용한다.
- 자바의 BufferedReader와 동일.
- Jsp의 request.getReader()와 동일.

## 5. @ResponseBody
- 해당 어노테이션은 @Controller 클래스에서 ViewResolver가 관여하지 못하게 한다.
- raw 데이터를 return할 때 사용한다.
- 자바의 BufferedWriter 혹은 PrintWriter와 동일.
- Jsp의 out 객체와 동일.

## 6. @PathVariable
- 해당 어노테이션은 주소 패스 방식을 사용하게 해준다.
- http://localhost:8080/컨텍스트패스/post/{id}

## 7. jackson-mapper 라이브러리
- 해당 라이브러리는 요청시 json 데이터를 java Object로 변환해주는 필터이다.
- 응답시 java Object를 json 데이터로 변환해주는 필터이다.
 
 
 
 
 