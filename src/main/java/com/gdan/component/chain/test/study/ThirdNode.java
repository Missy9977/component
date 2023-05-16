package com.gdan.compent.chain.test.study;

import com.gdan.compent.chain.IHandler;
import com.gdan.compent.chain.test.ChainConstants;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 描述
 *
 * @author : missy
 * @since : 2023-05-16 22:04
 */
@Component("studySecondNode")
@Order(3)
public class ThirdNode implements IHandler {

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
        System.out.println("听讲...");
        return 0;
    }
}