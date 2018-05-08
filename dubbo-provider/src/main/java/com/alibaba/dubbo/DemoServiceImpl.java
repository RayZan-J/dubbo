package com.alibaba.dubbo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 * @author nantian
 */
public class DemoServiceImpl implements DemoService
{

    @Override
    public List<String> getPermissons(long id) {
        List<String> demos = new ArrayList<String>();
        demos.add(String.format("Permisson_%d",id-1));
        demos.add(String.format("Permisson_%d",id));
        demos.add(String.format("Permisson_%d",id+1));
        return demos;
    }
}
