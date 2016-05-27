package com.arialyy.frame.http;

/**
 * Created by zengqr1 on 2016/5/27.
 * 上传请求体进度回调接口，比如用于文件上传中
 */
public interface ProgressRequestListener {
    void onRequestProgress(long bytesWritten, long contentLength, boolean done);
}
