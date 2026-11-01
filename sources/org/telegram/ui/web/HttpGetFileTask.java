package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.File;
import org.telegram.messenger.r20;
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private r20 doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private r20 progressCallback;

    public HttpGetFileTask(r20 r20Var, r20 r20Var2) {
        this.doneCallback = r20Var;
        this.progressCallback = r20Var2;
    }

    public static void b(HttpGetFileTask httpGetFileTask, float f7) {
        httpGetFileTask.lambda$doInBackground$0(f7);
    }

    public void lambda$doInBackground$0(float f7) {
        this.progressCallback.a(Float.valueOf(f7));
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
        r20 r20Var = this.doneCallback;
        if (r20Var != null) {
            if (this.exception == null) {
                r20Var.a(file);
            } else {
                r20Var.a(null);
            }
        }
    }
}
