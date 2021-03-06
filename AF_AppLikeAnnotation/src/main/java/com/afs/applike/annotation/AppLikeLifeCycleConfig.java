package com.afs.applike.annotation;

public class AppLikeLifeCycleConfig {

    /**
     * 要生成的代理类的包名，该包名下不要有其他不相关的业务类
     */
    public static final String PROXY_CLASS_PACKAGE_NAME = "com.afs.applike.init";

    /**
     * 生成代理类统一的后缀
     */
    public static final String PROXY_CLASS_SUFFIX = "$$Proxy";

    /**
     * 生成代理类统一的前缀
     */
    public static final String PROXY_CLASS_PREFIX = "AF$$";

}