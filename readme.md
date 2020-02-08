# Getting Started

##### 打包到dev
mvnw clean package -P dev
##### 打包到test
mvnw clean package -P test

#### 跳过测试用例 
mvnw clean package -D maven.test.skip = true