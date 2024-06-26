<p align="center">
  <img src=https://github.com/hyezuu/ssudam/assets/147456219/8e013df6-7e1c-45b3-9382-8f0a1b11c9be>
</p>

<h3 align='center'> 쓰담(SSUDAM)은 쓰레기 담기의 줄인말로 
<br>
  함께 플로깅을 할 사람을 모집하는 플로깅 커뮤니티 사이트입니다. </h3>
<p align="center">  
  <em> * 플로깅(Plogging)은 '줍다'라는 뜻의 스웨덴어 플로카 업(plocka upp)과</em>
<br>
  <em>'달리다'라는 뜻의 영어 조깅(Jogging)을 합성한 단어로,</em>
<br>
  <em>쓰레기를 주우며 조깅하는 행동을 의미합니다</em>
<br>
</p>

---------


## 🏃‍♂️기획의도
- 코로나로 인한 비대면 상황을 거친 후 줄어든 사람들 간의 소통
- 점점 더 악화되는 환경 문제에 이바지하기 위함
- 운동은 하고싶은데 동기가 부족하거나, 작게나마 뿌듯함을 느끼고 싶은 분들, 지역 주민들과 함께 참여하고 건강 증진을 위한 운동 기회를 제공하기 위함

<br> 

## 🏃‍♀️목표 및 기대효과
- 사회적으로 소통하며 활동량을 높인다.
- 환경보호와 건강을 동시에 고려하는 활동으로 사용자들에게 지속 가능한 라이프 스타일의 중요성을 일깨운다.
- 사용자들은 쓰레기 수거와 운동의 조합으로 건강한 라이프스타일을 즐기며 만족감을 느낄 수 있다.

<br>

## 🚩 개요
- 프로젝트 이름 : 쓰담 (SSUDAM)
- 프로젝트 기간 : 2023.12.22 ~ 2024.01.23
- 백엔드 서비스 메뉴얼 : [SSUDAM 백엔드 서비스 메뉴얼 ✨](https://gregarious-diagram-be0.notion.site/SSUDAM-a654f4266fcf4111b404737bf1ff1b31?pvs=4)
- 팀 Repo : [SSUDAM✨](https://github.com/codestates-seb/abc02_002)

---------

## 👀 Team SSUDAM

|**강혜주**|**김수안**|**최준하**|**조은희**|
|:--:|:--:|:--:|:--:|
|<img src="https://github.com/codestates-seb/abc02_002/assets/118452650/f316cf92-de9c-472b-80b3-8e98eae90e93" width="150px" height="150px">|<img src="https://github.com/codestates-seb/abc02_002/assets/118452650/ae043c41-5b33-4a5c-a7ab-0af2ca31cd06" width="150px" height="150px"> | <img src="https://github.com/codestates-seb/abc02_002/assets/118452650/6c1cc0e2-8455-4044-a71b-4fab234faa9f" width="150px" height="150px"> | <img src="https://github.com/codestates-seb/abc02_002/assets/118452650/e118b13e-d2e7-4e52-81ef-c35bed264eb6" width="150px" height="150px">|
|BE(팀장)|BE|BE|BE|
|[hyezuu](https://github.com/hyezuu)|[sooani](https://github.com/sooani)|[choijh0309](https://github.com/choijh0309)|[eunhee78](https://github.com/eunhee78)|

<br><br>

|**배정현**|**이혜원**|**안민주**|**김윤한**|
|:--:|:--:|:--:|:--:|
|<img src="https://github.com/hyezuu/ssudam/assets/147456219/1423f5f9-d618-447c-a884-69b927cc39f0" width="150px" height="150px">|<img src="https://github.com/hyezuu/ssudam/assets/147456219/3d0538d1-d2bb-4b57-9a0c-80dbbf8aa58d" width="150px" height="150px"> |<img src="https://static.wikia.nocookie.net/catchteeniepin/images/5/58/Sandping_render_1.png/revision/latest?cb=20231104013915" width="150px" height="150px"> |<img src="https://github.com/hyezuu/ssudam/assets/147456219/69366580-6a15-4547-88d4-2548741a5281" width="150px" height="150px">|
|FE(팀장)|FE|FE|FE|
|[bjh0524](https://github.com/bjh0524)|[hyehye225](https://github.com/hyehye225)|[anminjoo](https://github.com/anminjoo)|[YunHanKIM](https://github.com/YunHanKIM)|


<br><br>

---------

# 👩‍🌾 *hyezuu's Role*👨‍🌾

### 백엔드 팀장 & 응원단장💛
- 백엔드 리드 및 프론트엔드와의 소통

### Restful API를 활용한 댓글 및 댓글 좋아요 기능
- `Comment` & `Like` 도메인 작성
- JPA 쿼리 메서드를 활용하여 특정 회원이 작성한 모든 댓글 및 모집글에 존재하는 모든 댓글 조회 가능
- 최신순 조회 및 좋아요순 조회 구현

### Restful API를 활용한 대댓글 기능
- `Reply` 도메인 작성
- 댓글 조회시 대댓글이 존재한다면, Dto 형태로 변환해서 함께 가져 올 수 있게 구현
- Mapstruct의 `create()` 메서드 사용하여 코드 중복 제거

### Restful API를 활용한 북마크 기능
- `Bookmark` 도메인 작성
- 조인 엔티티를 사용해 멤버와 모임글 연결
- JPA 쿼리 메서드 `existBy()`, `save()`, `delete()` 사용  

### 연관 관계 매핑 및 편의 메서드 작성
- 모든 연관관계 매핑 `OneToOne`, `ManyToOne`, `OneToMany`
- 관계의 주인 객체(부모객체)에 `cascade` 설정 (`CascadeType.REMOVE`,`CascadeType.PERSIST`)

### 공통 기능 구현
- **예외처리**
  - `GlobalExceptionAdvice`
  - `BusinessLogicException`
  - `ExceptionCode`
  - `ErrorResponse`
- **Util**
  - `CustomBeanUtils`
  - `UriCreator` 
- **Auditable**
  - 추상클래스
  - `createdAt`, `ModifieAt` 필드 정의
  - `EntityListeners` 사용
- **Dto**
  - `SingleResponseDto`
  - `MultiResponseDto`
  - `PageInfo`

### Advice, CustomAnnotation을 사용한 리소스 접근 검증
- `MemberVerifyAdvice` 클래스 구현
- `Interface` 사용하여 중복로직 제거
- `CustomAnnotation` 사용하여 코드 수정 최소화

### OpenWeather API를 활용한 5일 내의 날씨예보 API 호출
- `RestTemplate` 사용
- `Stream` 사용하여 응답 필터링 

### 슬라이스 테스트에 Mockito 적용
- 구현한 모든 도메인 `test case` 작성 

### Spring Rest Docs를 이용한 API 문서 작성
- `Restdocs`의 api 스펙 정보 코드를 `test case`에 함께 작성
- test 통과시 생성되는 `snippets` 으로 api문서 작성

### Apache Benchmarking tool을 활용한 성능 테스트
- `Gnuplot`을 사용하여 결과 그래프 생성


<br>

## 🪄 Pages Preview
<details>
  <summary>자세히 보기</summary>
  <div markdown="1">

| 북마크 기능 | 댓글 등록 |
| :---: | :---: |
|  <img src="https://github.com/codestates-seb/abc02_002/assets/147456219/1de7774d-d871-41f1-b614-3aad6cabc1ce" width="370" height="200"/>  | <img src="https://github.com/codestates-seb/abc02_002/assets/147456219/ff6af06f-2e82-4909-93de-946d5230f56c" width="370" height="200"/> |

| 댓글 삭제 | 대댓글 등록 |
| :---: | :---: |
| <img src="https://github.com/codestates-seb/abc02_002/assets/147456219/1eb14cbc-7adb-4ea7-8404-e7f0185f1213" width="370" height="200"/> | <img src="https://github.com/codestates-seb/abc02_002/assets/147456219/8e56e3f4-f719-4731-a59a-db9b4f3ea6f2" width="370" height="200"/> |

| 마이페이지 : 나의모임 | 마이페이지 : 나의 글/댓글 |
| :---: | :---: |
| <img src="https://github.com/codestates-seb/abc02_002/assets/147456219/40b9a0ac-0e36-4456-8975-b57cdff6b4f8" width="370" height="210"/> | <img src="https://github.com/codestates-seb/abc02_002/assets/147456219/b0bb509d-9f65-4be3-87ee-ca94558d8487" width="370" height="200"/> |

| 마이페이지 : 북마크 | 회원 탈퇴 |
| :---: | :---: |
| <img src="https://github.com/codestates-seb/abc02_002/assets/147456219/7dda3383-2f5b-42f7-9274-031ab859841b" width="370" height="210"/> | <img src="https://github.com/codestates-seb/abc02_002/assets/147456219/b1a2c74b-7f78-4d94-a0c9-6d86531b2809" width="370" height="200"/> |

</div>
</details>

<br><br>
---------

## 🛠 기술 스택
![image](https://github.com/codestates-seb/abc02_002/assets/118452650/60fc2529-6f19-4a69-932a-75c0549433e3)

### 공통
<img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=Github&logoColor=white"><img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white">
<img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white">
<img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=Discord&logoColor=white">
<br>
    
### 백엔드
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"><img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white"><img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=Java&logoColor=white"><img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)

![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)
![SpringSecurity](https://img.shields.io/badge/SpringSecurity-6DB33F.svg?style=for-the-badge&logo=SpringSecurity&logoColor=white)

<img src="https://img.shields.io/badge/Amazon AWS-232F3E?style=for-the-badge&logo=Amazon AWS&logoColor=white"><img src="https://img.shields.io/badge/Amazon RDS-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">
<img src="https://img.shields.io/badge/Amazon EC2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white">

![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)
![Windows](https://img.shields.io/badge/macOS-000000?style=for-the-badge&logo=macos&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
<br>

### 프론트엔드
<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"><img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"><img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"><img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black"><img src="https://img.shields.io/badge/Axios-181717?style=for-the-badge&logo=Axios&logoColor=white"><img src="https://img.shields.io/badge/Redux Toolkit-764ABC?style=for-the-badge&logo=Redux&logoColor=white">
<img src="https://img.shields.io/badge/Amazon S3-569A31?style=for-the-badge&logo=amazons3&logoColor=white">

<br>

-------


# 👀 FeedBack 

## **🙋‍♀️ Strengths**
1. **테스트 케이스 작성과 API 문서 자동화**
   - API 문서를 자동화하기 위한 테스트 케이스를 작성하는 데 성공했습니다.

2. **보안 취약점 테스트 수행**
   - 애플리케이션의 보안 취약점을 직접 테스트하여 안전성을 강조했습니다.

3. **성능 테스트 수행**
   - Apache Benchmark 툴을 이용한 성능 테스트를 통해 애플리케이션의 성능 향상을 확인하고 개선했습니다.

4. **기본에 충실한 코드 구현**
   - 수강 기간 동안 배운 기본 지식을 활용하여 간결하고 가독성 있는 코드를 구현했습니다.

## **👩‍💻 Areas for Improvement**
1. **비즈니스 로직에 대한 단위 테스트 작성**
   
2. **API 문서에 요청헤더 추가 (Access Token 등)**

3. **WireMock을 사용한 외부 Api 요청/ 응답 테스트 진행**

4. **Spring MVC의 캐싱 기능, JPA의 2차 캐시를 활용한 성능 향상**
     
5. **jpa.showsql 설정을 통한 로그확인 및 불필요한 쿼리 제거**
     
6. **간단한 매핑작업에 Java record를 활용하여 불변 객체 구현**





