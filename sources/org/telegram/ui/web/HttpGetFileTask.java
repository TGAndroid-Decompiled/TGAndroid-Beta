package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.File;
import org.telegram.messenger.z10;
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private z10 doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private z10 progressCallback;

    public HttpGetFileTask(z10 z10Var, z10 z10Var2) {
        this.doneCallback = z10Var;
        this.progressCallback = z10Var2;
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
        z10 z10Var = this.doneCallback;
        if (z10Var != null) {
            if (this.exception == null) {
                z10Var.a(file);
            } else {
                z10Var.a(null);
            }
        }
    }
}
