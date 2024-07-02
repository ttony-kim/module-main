Module을 주입받는 Main 프로젝트
===============================
### 1. gradle.build
```java
dependencies {
  ...
  implementation files("lib/module.jar")
  ...
}
```
__module.jar__ 추가 (gradle refresh)
### 2. RootApplication.java
``` java
@SpringBootApplication
@EntityScan("com.example.root") // main package 명 추가
@EnableJpaRepositories("com.example.root") // // main package 명 추가
public class RootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RootApplication.class, args);
	}

}
```
module의 스프링 정보가 덮어씌워지는지 추가 해주지 않으면 __JpaRepository를 Bean으로 등록시켜주지 못함__

### 3. RootTestContoller.java, RootEntityRepository.java, RootEntityRepository2.java
![image](https://github.com/ttony-kim/module-main/assets/69332203/acae2461-54d5-4c1c-ba6c-789d5c2e0957)

__1개의 Entity__를 __2개의 JpaRepository__에서 접근 가능
