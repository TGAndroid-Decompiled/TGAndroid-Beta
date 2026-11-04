package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.File;
import org.telegram.messenger.u10;
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private u10 doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private u10 progressCallback;

    public HttpGetFileTask(u10 u10Var, u10 u10Var2) {
        this.doneCallback = u10Var;
        this.progressCallback = u10Var2;
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

    public HttpGetFileTask setMaxSize(long j10) {
        this.max_size = j10;
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
        u10 u10Var = this.doneCallback;
        if (u10Var != null) {
            if (this.exception == null) {
                u10Var.a(file);
            } else {
                u10Var.a(null);
            }
        }
    }
}
