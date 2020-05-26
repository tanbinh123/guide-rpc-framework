package github.javaguide;

import github.javaguide.registry.DefaultServiceRegistry;
import github.javaguide.transport.socket.SocketRpcServer;

/**
 * @author shuang.kou
 * @createTime 2020年05月10日 07:25:00
 */
public class RpcFrameworkSimpleServerMain {
    public static void main(String[] args) {
        HelloServiceImpl helloService = new HelloServiceImpl();
        DefaultServiceRegistry defaultServiceRegistry = new DefaultServiceRegistry();
        // 手动注册
        defaultServiceRegistry.register(helloService);
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        socketRpcServer.start(9999);
    }
}