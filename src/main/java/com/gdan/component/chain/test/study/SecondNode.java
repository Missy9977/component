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
@Component("studySecondNode")
@Order(2)
public class SecondNode implements IHandler {

    @Override
    public String getHandlerName() {
        return "studySecondNode";
    }

    @Override
    public String getChainName() {
        return ChainConstants.CHAIN_STUDY;
    }

    @Override
    public int execute() {
        System.out.println("看黑板...");
        return -1;
    }
}
