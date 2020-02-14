### COLA 2.0 介绍

cola 2.0 以提供项目脚手架和框架组件的形式来为应用架构提供一套简单的可以复制、可以理解、可以落地、可以控制复杂性的”指导和约束"。

* 明确的模块(module)-组件(package)划分:
模块按照maven的module划分
* package作为次级结构, 在module中按照package组织并实现下述结构:
command相关:
command: 命令
Phase: 阶段, 没有具体实现代码
Step: 步骤, 没有具体实现代码
* PreInterceptor: command前拦截,形式:
  PostInterceptor(commands = ATAMetricQry.class), 没有列表说明适用于全局command
  可以作为validator
* PostInterceptor: command后拦截,同上
* EventHandler: 事件处理器
* Extension: 扩展点,具有如下属性:
    bizId: 业务: 支付
    useCase: 业务实例: xxx
    scenario: 场景: VIP
    

### 改进

* 增加cola-ext-query 模块，更好的实现CQRS(命令与查询分离)

* 增加cola-ext-shared 模块, 与领域无关，技术细节相关的接口约定包，具体实现在infrastructure模块中。比如缓存、事件、MQ消息









