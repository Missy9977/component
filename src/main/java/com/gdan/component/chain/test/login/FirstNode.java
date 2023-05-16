package com.gdan.component.chain.test.login;

import com.gdan.component.chain.IHandler;
import com.gdan.component.chain.test.ChainConstants;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 描述
 *
 * @author : missy
 * @since : 2023-05-16 22:02
 */
@Component("loginFirstNode")
@Order(1)
public class FirstNode implements IHandler {

    @Override
    public String getHandlerName() {
        return "loginFirstNode";
    }

    @Override
    public String getChainName() {
        return ChainConstants.CHAIN_LOGIN;
    }

    @Override
    public int execute() {
        System.out.println("输入账号...");
        return 0;
    }
}
