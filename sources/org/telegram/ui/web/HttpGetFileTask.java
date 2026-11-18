package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.File;
import org.telegram.messenger.x10;
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private x10 doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private x10 progressCallback;

    public HttpGetFileTask(x10 x10Var, x10 x10Var2) {
        this.doneCallback = x10Var;
        this.progressCallback = x10Var2;
    }

    public static void b(HttpGetFileTask httpGetFileTask, float f10) {
        httpGetFileTask.lambda$doInBackground$0(f10);
    }

    public void lambda$doInBackground$0(float f10) {
        this.progressCallback.a(Float.valueOf(f10));
    }

    public void lambda$doInBackground$1() {
        this.progressCallback.a(Float.valueOf(1.0f));
    }

    public HttpGetFileTask setDestFile(File file) {
        this.file = file;
        return this;
    }

    public HttpGetFileTask setMaxSize(long j3) {
        this.max_size = j3;
        return this;
    }

    public HttpGetFileTask setOverrideExtension(String str) {
        this.overrideExt = str;
        return this;
    }

    @Override
    public java.io.File doInBackground(java.lang.String... r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.HttpGetFileTask.doInBackground(java.lang.String[]):java.io.File");
    }

    @Override
    public void onPostExecute(File file) {
        x10 x10Var = this.doneCallback;
        if (x10Var != null) {
            if (this.exception == null) {
                x10Var.a(file);
            } else {
                x10Var.a(null);
            }
        }
    }
}
