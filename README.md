# [CH2 계산기 과제] 📝

## 📖 과제 소개
- **Lv1.** 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
  - 자바의 기본 문법을 사용하여 자바의 절차적 프로그래밍 구현
- **Lv2.** 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기
  - 객체 지향 개념을 적용하여 클래스를 정의하고, 연산 수행하는 메소드 작성
- **Lv3.** Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기
  - Enum 타입을 활용하여 연산자 타입 정의
  - Generic 사용하여 여러 타입의 피연산자 입력 받도록 기능 확장 
  - Lambda & Stream을 활용하여 요구사항을 만족하는 조회 메서드 구현 

---
## 📚 기능

### 📁 **[calculator]**
1. 숫자(정수) 2개와 사칙연산 기호 입력
2. 사칙연산 기호에 맞는 연산자를 사용하여 연산 수행
3. 종료 여부 결정 (exit 입력 시 반복문 종료되며 계산기 종료)

- ⚠️ **예외 처리**
  - 두 번째 숫자 0 입력 후 나눗셈 연산 -> "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."

### 📁 **[calculator2]**
1. 숫자(정수) 2개와 사칙연산 기호 입력
2. calulate() 메서드 호출하여 연산 수행
3. 결과 리스트의 크기가 5보다 큰 경우
   - 결과 리스트의 첫 번째 데이터 삭제 
4. 종료 여부 결정 (exit 입력 시 리스트 초기화되며 계산기 종료)

- ⚠️ **예외 처리**
  - 두 번째 숫자 0 입력 후 나눗셈 연산 -> "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."

### 📁 **[calculator3]**
1. 숫자(정수/실수) 2개와 사칙연산 기호 입력
2. calulate() 메서드 호출
3. enum으로 정의된 연산 기호와 비교 후 연산 수행
4. 결과 리스트의 크기가 5보다 큰 경우
   - 숫자(정수/실수) 입력
   - 입력받은 값보다 큰 결과값 리스트 출력
   - 입력받은 값보다 작은 결과값 리스트 출력
   - 결과 리스트의 첫 번째 데이터 삭제
5. 종료 여부 결정 (exit 입력 시 리스트 초기화되며 계산기 종료)

- ⚠️ **예외 처리**
  -  숫자 입력 오류 -> "[Error] 숫자가 아닙니다."
  -  연산자 입력 오류 -> "[Error] 부적절한 연산자 타입: "
  -  두 번째 숫자 0 입력 후 나눗셈 연산 -> "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."
---
## ⚙️ 사용 언어
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white">

---
## 🧩 트러블슈팅
- 트러블슈팅 작성한 페이지
<a href="https://velog.io/@yyrkk/TIL-CH2-%ED%8A%B8%EB%9F%AC%EB%B8%94%EC%8A%88%ED%8C%851" target="_blank">
<img src="https://img.shields.io/badge/계산기 과제 트러블슈팅-EAEAEA.svg?style=for-the-badge"/>
</a>
