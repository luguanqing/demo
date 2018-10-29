package com.example.demo.interceptor.service;

import java.net.InetAddress;

/**
 * @author lu.sa
 * @createtime 2018-10-29 21:30
 */

public class LoginService {

    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        String ip=addr.getHostAddress().toString(); //获取本机ip
        String hostName=addr.getHostName().toString(); //获取本机计算机名称
        System.out.println(ip);
        System.out.println(hostName);
    }
}