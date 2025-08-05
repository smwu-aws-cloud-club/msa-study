# msa-study

# 👩🏻‍💻 스터디 멤버

<table>
  <tr>
      <td align="center">
        <img src="https://github.com/fire-long.png" width="100"><br>
        <a href="https://github.com/fire-long">박진영</a>
    </td>
    <td align="center">
      <img src="https://github.com/dylee00.png" width="100"><br>
      <a href="https://github.com/dylee00">이다연</a>
    </td>
    <td align="center">
      <img src="https://github.com/hiimminjeong.png" width="100"><br>
      <a href="https://github.com/hiimminjeong">정민정</a>
    </td>
    <td align="center">
      <img src="https://github.com/esc-beep.png" width="100"><br>
      <a href="https://github.com/esc-beep">최은소</a>
    </td>
    <td align="center">
      <img src="https://github.com/isuHan.png" width="100"><br>
      <a href="https://github.com/isuHan">한지수</a>
    </td>
  </tr>
</table>

# 1️⃣ 스터디 계획

### 7/18 ~ 7/24
- service registry - eureka
  - eureka 구조 이해
- eureka server, eureka client 로 service registry 실습
<details>
  <summary>실행 예시</summary>
  <img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/0e63101f-f7fb-42b1-8470-bf9938528834" />
  eureka server로 들어갔을 때, gateway-test가 service registey에 등록된 걸 확인하실 수 있으면 구현 성공!
</details>

### 7/25 ~ 7/31
- gateway
  - spring cloud gateway 구조
- gateway 로 간단한 라우팅 실습
<details>
  <summary>실행 예시</summary>
  <img width="1134" height="509" alt="Image" src="https://github.com/user-attachments/assets/9b4d03f9-f499-4ada-bd0e-f645a697003c" />
  `curl http://localhost:8080/test` ← 여기로 보내면 gateway-test에 대한 요청이 gateway를 통해 적절하게 오는지 확인하기

  <img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/7a909d35-7efd-414f-b1b7-a230c3b46c54" />
  gateway, gateway-test 모두 service registry에 등록되어 있어야 함

</details>
