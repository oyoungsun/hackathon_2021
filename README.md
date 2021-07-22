# hackathon_2021

## 2021년 컴퓨터학부 해커톤 레포

팀명 : 옹심이 칼국수

팀장 : 오영선

팀원 : 김유진, 송혜경, 권다운

대회 주제 : COVID-19로 변화된 대학 생활을 개선할 수 있는 창의적이고 혁신적인 소프트웨어 자유 개발

### 제목(주제) : 도와줘요 옹심이 - 경북대학교 재학생 간 도움 및 심부름 대행 플랫폼

 사용 대상 : 도움이 필요하거나 간단한 일거리를 통해 수익을 얻고 싶은 경북대학교 재학생

 한줄 요약 : 심부름, 물품 대여 등 도움이 필요할 때 같은 경북대 재학생에게 부탁하고 코인을 지불하는 (심부름 대행)서비스 제공 어플리케이션.

 <img src="https://github.com/zladb/hackathon_2021/blob/main/%EA%B7%B8%EB%A6%BC1.png?raw=true" width="150" height="150"/>
 _대표 캐릭터 옹심이_

### 제작 목적

 COVID-19로 인해 자취방, 기숙사 등 집에서 생활하는 시간이 늘어나며 혼자서 해결이 어려운 문제를 함께 도와줄 사람이 필요함을 느낌.

 아파서 약이 필요하거나 집에 벌레가 나왔을 때, 갑자기 비가 와서 곤란할 때 등 도움이 필요했던 경험을 떠올려, 같은 경북대학교 재학생끼리 서로 도울 수 있도록 연결다리 역할을 하는 어플리케이션을 구상하게 됨.

### 제품 설명

 ###### 1. 로그인 화면
 
 이미지 : 로그인 화면

 기능 : 기존에 가입한 회원 정보로 로그인을 할 수 있음. 
 구현 방법 : 데이터 베이스의 USER_DATA 버킷에 저장된 사용자명과 패스워드를 대조하여 일치하면 로그인 성공.
 
 이미지 : 회원가입 화면

 사용자명, 비밀번호, 이름, 나이, 단과대 등을 입력하고, 학생증 인증 과정을 거쳐 신원이 확인되면 회원가입이 완료됨. 데이터 베이스의 USER_DATA 버킷에 각각의 태그로 정보가 저장됨.
 
 이미지 : user_data

 ###### 2. 메인 홈
 
 이미지 : 메인 이미지
 기능 : main페이지에는 가장 최근에 작성된 5개의 심부름 목록이 나타나며, 필터를 통해 정렬 및 검색을 할 수 있음. 글쓰기 버튼을 누르면 write페이지로, 글 목록을 누르면 Screen2페이지로 이동됨.
 
 구현 방법 : 글쓰기 페이지를 통해 작성된 글이 TEXT_DATA/사용자ID 버킷에 저장되면, 거기서 title과 content 값을 들고와서 출력 됨

이미지 : text_data

 ###### 3. 상세 페이지
이미지
 기능 : 의뢰의 자세한 내용을 보고 채팅 및 의뢰 수락을 할 수 있는 페이지. 
 구현 방법 : TEXT_DATA/사용자ID 버킷에 저장된 더 상세한 정보(위치, 가격, 자세한 의뢰 내용)를 출력함.

 ###### 4. 1:1 채팅
이미지
 기능 : 의뢰자와 1:1 채팅을 통해 자세한 의뢰 내용과 일정, 수당을 조정할 수 있음. 
 제작 방법 : 채팅 내역은 텍스트 박스안에 글을 적고 send 버튼을 눌렀을 때, 데이터베이스의 CHAT 버킷 아래 두 사람 간의 고유한 채팅방 태그 안에 저장됨.
 유저는 회원가입을 하면서 각자 고유한 세자리 번호(100~999)를 가지게 되는데, 채팅하기 버튼을 누르면 유저A와 B의 고유번호 두개를 해시함수에 넣어서 채팅방 태그를 하나 뽑아냄.
 해시함수는 다음과 같이 두 숫자를 곱해서 1000으로 나눈 나머지를 결과 값으로 함. (A_고유번호 * B_고유번호)%1000
 
 이미지 : chat_data
 
 ###### 5. 검색: 키워드를 입력하면 해당 글이 검색됨.

 ###### 6. 글쓰기
이미지
기능 :  제목, 내용, 장소, 마감기한, 가격을 포함하여 글을 작성할 수 있음. 
구현 방법 : TEXT_DATA/사용자ID 버킷 속 각 태그안에 저장됨.

 ###### 7. 마이페이지
이미지
기능 : 내 정보 수정이 가능한 페이지이며, 자신이 쓴 글을 보거나 로그아웃을 할 수 있음. 
구현 방법 : 회원가입 시 등록한 내 정보를 데이터베이스 USER_DATA에서 딕셔너리 형식으로 추출하여 출력함. 수정하기 버튼을 누르면 데이터베이스에 새로운 정보를 업데이트함. 로그아웃시 홈 화면으로 돌아옴.

### 시연 영상

### 기대효과


- 이번 7월에 누리관에서 코로나 확진자가 발생하게 되어 자가격리를 하게 된 기숙사생 처럼 자가격리를 하게되어 밖으로 외출을 하지 못하는 사람들에게 생필품을 전달하거나, 책 반납, 택배를 대신 부치는 등의 도움을 줄 수 있음.
 
- 코로나 시국으로 인해 학우간 교류가 적어져서 친구가 없는 사람에게 인맥을 넓힐 수 있는 기회를 제공함. (수강신청 도움받기, 밥 같이 먹기, 패션 조언 받기 등)
 
- 혼자 자취를 하면서 생기는 곤란한 일들을 어플을 통해 주변 이웃에게 도움을 받을 수 있게 됨.
 
- 심부름 대행자는 자신이 가능한 시간대에 자유롭게 의뢰를 해결하고 보상을 받을 수 있음.
 
- 경북대학교 재학생이 서로를 도우며 유대감이 상승함.
 
