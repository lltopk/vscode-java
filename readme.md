## vscode java开发环境

安装oracle java插件
> https://github.com/oracle/javavscode
> https://marketplace.visualstudio.com/items?itemName=Oracle.oracle-java

## 配置项目jdk路径
配置settings.json
- "jdk.jdkhome": 指定语言服务器版本, 必须大于等于17
- "jdk.project.jdkhome": 指定项目使用的Java版本, 支持Java8
```
{
    "jdk.project.jdkhome": "C:\\Users\\hasee\\.jdks\\corretto-1.8.0_472",
    "jdk.jdkhome": "C:\\Users\\hasee\\.jdks\\ms-17.0.17",
    "jdk.telemetry.enabled": true,
}
```

## 配置系统maven
> 就maven项目来说简单易用, 自动识别系统maven

配置maven环境
```
MAVEN_HOME: C:\Users\hasee\.mvn\apache-maven-3.9.11-bin\apache-maven-3.9.11
PATH: %MAVEN_HOME%\bin
```
验证maven环境
```
C:\Users\hasee>mvn -v
Apache Maven 3.9.11 (3e54c93a704957b63ee3494413a2b544fd3d825b)
Maven home: C:\Users\hasee\.mvn\apache-maven-3.9.11-bin\apache-maven-3.9.11
Java version: 1.8.0_472, vendor: Amazon.com Inc., runtime: C:\Users\hasee\.jdks\corretto-1.8.0_472\jre
Default locale: zh_CN, platform encoding: GBK
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

创建Java项目: ctrl shift p java:new project
- java with maven
- java with gradle

> oracle java插件基于netbeans, 性能由于微软红帽
>
> 可惜的是它暂不支持sprigboot以及lombok, 需要继续观望
>
> 微软红帽的Java支持springboot生态, 但微软的不太好用
