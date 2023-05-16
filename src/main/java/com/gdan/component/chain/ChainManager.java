package com.gdan.compent.chain;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/**
 * 责任链管理器
 *
 * @author : missy
 * @since : 2023-05-16 21:47
 */
@Component
public class ChainManager {

    /**
     * 所有处理器
     */
    @Autowired
    private List<IHandler> allHandlers;

    /**
     * 责任链map k:责任链名称， v：处理器集合
     */
    private Map<String, List<IHandler>> handlerMap;

    public void execute(String chainName) {
        if (CollectionUtils.isEmpty(handlerMap)) {
            return;
        }
        List<IHandler> handlers = handlerMap.get(chainName);
        Optional.ofNullable(handlers).ifPresent(list -> {
            for (IHandler handler : list) {
                int execute = handler.execute();
                // 是否重试
                // 记录
            }
        });
    }

    @PostConstruct
    private void init() {
        if (!CollectionUtils.isEmpty(allHandlers)) {
            handlerMap = allHandlers.stream().collect(Collectors.groupingBy(IHandler::getChainName));
        }
    }
}
