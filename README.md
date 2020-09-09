# dubbo-test

    hp的dubbo 学习
    本地启动：
    一：进入apache-normal 模块
    (1)修改provider模块application.yml文件中zookeeper地址(zookeeper的默认地址为：127.0.0.1:2181)
    (2)修改consumer模块application.yml文件中zookeeper地址(zookeeper的默认地址为：127.0.0.1:2181)
    
    (3)访问 http://127.0.0.1:9191/defaultSPI，
            http://127.0.0.1:9191/say?sa=hello
            
    shell 脚本提交及修改版本号
    (1)提交
        terminal 界面 执行 ./commit.sh 或 ./commit.sh message   # message为提交信息
    (2)修改版本号并提交            
        terminal 界面 执行 ./build-version.sh y 或 ./build-version.sh n  # y:改版本号并提交，n:只改版本号