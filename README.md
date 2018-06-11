# springboot
这个仓库是记录我学习springboot用的
###idea中的项目怎么上传至github
1）首先，在idea中创建一个maven工程（目前基本都是用maven构建工程的，所以一般都创建其工程）
2）然后在idea中先配置git，settings中输入git进行配置
3）再配置github
4）将创建的该项目交给git版本管理：点击vcs、选择Import into Version Control、然后选择Create Git Repository即可
5）然后在项目上右击，add、commit等，就提交到本地仓库中了
6）上传至github：选中vcs、Import into Version Control、Share project on github即可
###注意顺序
1）一定不要先在github上创建好仓库，然后再clone，再导入idea中【这是错误的做法】
2）是否是maven工程的标准：maven工程都有pom.xml文件
3）maven工程目录结构一定是这样：工程名：src --> main  -->java、webapps、resources
                                       --> test  -->java
