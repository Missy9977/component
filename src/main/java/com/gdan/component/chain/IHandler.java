package com.gdan.compent.chain;

/**
 * 处理器
 *
 * @author : missy
 * @since : 2023-05-16 21:37
 */
public interface IHandler {

    /**
     * 获取处理器名称
     *
     * @return 处理器名称
     */
    String getHandlerName();

    /**
     * 获取责任链名称
     *
     * @return 任链名称
     */
    String getChainName();

    /**
     * 执行主逻辑
     *
     * @return 返回码
     */
    int execute();
}
