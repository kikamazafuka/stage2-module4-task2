package com.mjc.stage2.impl;


import com.mjc.stage2.Connection;

public class ProxyConnection implements Connection {
    private RealConnection realConnection;
    private ConnectionPool connectionPool;

    public ProxyConnection(RealConnection realConnection ) {
        this.realConnection = realConnection;
        this.connectionPool = ConnectionPool.getInstance();
    }

    public void reallyClose() {
        realConnection.close();
    }

    @Override
    public void close() {
    }

    @Override
    public boolean isClosed() {
        return realConnection.isClosed();
    }
}
