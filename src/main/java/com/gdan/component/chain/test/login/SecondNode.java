package com.gdan.compent.chain.test.login;

import com.gdan.compent.chain.IHandler;
import com.gdan.compent.chain.test.ChainConstants;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 描述
 *
 * @author : missy
 * @since : 2023-05-16 22:02
 */
@Component("loginSecondNode")
@Order(2)
public class SecondNode implements IHandler {

    @Override
    public String getHandlerName() {
        return "loginSecondNode";
    }

    @Override
    public String getChainName() {
        return ChainConstants.CHAIN_LOGIN;
    }

    @Override
    public int execute() {
        System.out.println("输入密码...");
        return 0;
    }
}
