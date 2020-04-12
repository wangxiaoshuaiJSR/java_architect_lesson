package org.architect.wxs.mediatorpattern.rpc;

/**
 * {@link}
 *
 * @author wangxiaoshuai on 2020/3/22
 * @javadoc ：
 */
public class AService extends IService {
    private Registry registry;

    AService(){
        registry.regist("aService",this);
    }
}
