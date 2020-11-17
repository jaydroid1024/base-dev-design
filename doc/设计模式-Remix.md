[参考课程 | 设计模式之美](https://time.geekbang.org/column/intro/250?code=Grxvvkczx9tydhzn0RhJfNfwaF2RgJA9qeUWd8orIYo%3D)

[参考课程 | java设计模式精讲 Debug 方式+内存分析](https://coding.imooc.com/class/270.html?mc_marking=6eab7b8c9bc28db4f23571353f1a9fe5&mc_channel=banner)

[参考书籍 | 设计模式之美]()

# Android 设计模式

## 第一章 认识UML

参考：

[控制对类成员的访问 | Java™ 教程中文版](https://pingfangx.github.io/java-tutorials/java/javaOO/accesscontrol.html)

[可见性修饰符 | Kotlin 语言中文站](https://www.kotlincn.net/docs/reference/visibility-modifiers.html)

Java 可见修饰符

下表显示了可以应用于每个访问修饰符的 Alpha 类成员的可见位置。

| 修饰符    | Alpha | Beta | Alphasub | Gamma |
| --------- | ----- | ---- | -------- | ----- |
| public    | Y     | Y    | Y        | Y     |
| protected | Y     | Y    | Y        | N     |
| default   | Y     | Y    | N        | N     |
| private   | Y     | N    | N        | N     |



类的UML表示

类之间的关系

建立类图

使用类图



## 第二章 软件设计七大原则

Principle

### 2.1 开闭原则

定义：一个实体（类、模块、函数）应该对扩展开放，对修改关闭。

思想：用抽象构建框架，用实现扩展细节

优点：提高软件系统的可复用性，可维护性

抽象场景：在面向更稳定的抽象编程时，通过面向对象语言的继承和多态机制，让一个类去继承一个固定的抽象类或接口，再通过重写

改变其固有方法或者添加新的扩展方法，当变化发生时，我们就可以通过上层抽象类来隔离同类变化。

这个场景的核心在于实现-抽象化：从具体的业务场景当中抽象出抽象模型，再从抽象模型中得出我们具体的业务模型

具体场景：校验规则相关（例如：校验一个字符串的格式是否合规、校验提交请求之前的参数是否合规等）

#### 2.1.1  开闭原则的应用

### 2.2 依赖倒置原则







## 第三章 设计模式

‘

