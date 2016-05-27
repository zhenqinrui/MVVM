package com.arialyy.frame.http;

/**
 * Created by zengqr1 on 2016/5/27.
 */
public interface ProgressResponseListener {
    void onResponseProgress(long readBytes, long totalLength, boolean done);
}
