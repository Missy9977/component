package com.gdan.component.chain.test.study;

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
@Component("studyFirstNode")
@Order(1)
public class FirstNode implements IHandler {

    @Override
    public String getHandlerName() {
        return "studyFirstNode";
    }

    @Override
    public String getChainName() {
        return ChainConstants.CHAIN_STUDY;
    }

    @Override
    public int execute() {
        System.out.println("打开书本...");
        return 0;
    }
}
