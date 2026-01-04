## vscode java开发环境

安装oracle java插件(基于netbeans), 支持并自带maven工具
> https://github.com/oracle/javavscode
> https://marketplace.visualstudio.com/items?itemName=Oracle.oracle-java

插件集成的maven工具目录
```
C:\Users\hasee\.vscode\extensions\oracle.oracle-java-25.0.0\nbcode\java\maven
```

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

## 初始化Java项目

ctrl shift p 
```
Java:New project
```

> oracle java插件基于netbeans, 性能优于微软红帽, 可惜的是它暂不支持sprigboot以及lombok, 需要继续观望
>
> 微软红帽的Java虽支持springboot生态, 但微软的不太好用
