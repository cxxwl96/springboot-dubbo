# springboot-dubbo

> springboot integrates dubbo's RPC request demo

Step:

1. Run Zookeeper server with client port 2181
2. Run provider on the project
3. Run consumer on the project
4. Open browser access address: http://localhost:8000/test/yourName

***
> zookeeper usage

Step:

1. [Download](https://www.apache.org/dyn/closer.cgi/zookeeper/)

   choose apache-zookeeper-3.9.0-bin.tar.gz

2. Edit `conf/zoo.cfg`

    ```shell
    # example sakes.
    dataDir=/xxx/apache-zookeeper-3.9.0/data
    dataLogDir=/xxx/apache-zookeeper-3.9.0/logs
    # the port at which the clients will connect
    clientPort=2181
    ```

3. Start zookeeper server

   Start:
    ```shell
    sh bin/zkServer.sh start
    ```
   Stop:
    ```shell
    sh bin/zkServer.sh stop
    ```