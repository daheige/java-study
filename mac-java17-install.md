# mac java 17 lts版本环境搭建
1. 下载java17
https://download.oracle.com/java/17/latest/jdk-17_macos-x64_bin.dmg
2. 点击安装java
3. 配置环境变量
vim ~/.bash_profile
```sh
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
#export JRE_HOME=$JAVA_HOME
#下面的路径根据实际路径填写
export MAVEN_HOME=/Library/Java/apache-maven-3.9.0
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
export PATH=$MAVEN_HOME/bin:$JAVA_HOME/bin:$PATH
```

:wq 保存
source ~/.bash_profile

4. 查看java版本
java --version
5. 编写一个java程序
```sh
% mkdir -p ~web/java
% cd ~/web/java
% vim HelloWorld.java
```
```java
public class Hello{
	public static void main(String args[]){
		System.out.println("hello,java");
	}
}
```

:wq 保存后，执行程序
```sh
% javac HelloWorld.java
% java HelloWorld
将输出：
hello,java
```

6.安装maven
下载:
```sh
% cd /Library/Java/
% sudo wget https://dlcdn.apache.org/maven/maven-3/3.9.0/source/apache-maven-3.9.0-src.tar.gz
解压到 /Library/Java/apache-maven-3.9.0
% sudo tar zxvf apache-maven-3.9.0-bin.tar.gz
查看版本
% mvn -v
Apache Maven 3.9.0 (9b58d2bad23a66be161c4664ef21ce219c2c8584)
Maven home: /Library/Java/apache-maven-3.9.0
Java version: 17.0.6, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
Default locale: zh_CN_#Hans, platform encoding: UTF-8
OS name: "mac os x", version: "12.6.3", arch: "x86_64", family: "mac"
```

# 详情参考：
- https://blog.csdn.net/Tony_CTO/article/details/128433696
- https://www.oracle.com/java/technologies/downloads/#jdk17-mac

