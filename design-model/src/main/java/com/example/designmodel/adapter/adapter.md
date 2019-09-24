##https://www.cnblogs.com/honger/p/5970283.html

###适配器模式的作用就是在原来的类上提供新功能。主要可分为3种：

类适配：创建新类，继承源类，并实现新接口，例如 

class  adapter extends oldClass  implements newFunc{}

对象适配：创建新类持源类的实例，并实现新接口，例如 

class adapter implements newFunc { private oldClass oldInstance ;}

接口适配：创建新的抽象类实现旧接口方法。例如 

abstract class adapter implements oldClassFunc { void newFunc();}


一、适配器模式，就像是你的电脑的电源一样，可以将220v的电压转化为你电脑能够承受的电压，又如从美国带回来的电器，需要一个适配电源将电压220v改成110v

二、适配器的两种模式：类的适配器和对象适配器

三、类适配器（主要使用继承方式来适配）