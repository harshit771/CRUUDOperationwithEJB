package com.infinite.ejb;

import javax.ejb.Remote;

@Remote
public interface InfiniteHelloWorldRemote {
    String sayHello();
    String greeting(String name);
}
