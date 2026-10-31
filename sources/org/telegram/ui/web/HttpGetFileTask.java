package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.File;
import org.telegram.messenger.q20;
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private q20 doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private q20 progressCallback;

    public HttpGetFileTask(q20 q20Var, q20 q20Var2) {
        this.doneCallback = q20Var;
        this.progressCallback = q20Var2;
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
        q20 q20Var = this.doneCallback;
        if (q20Var != null) {
            if (this.exception == null) {
                q20Var.a(file);
            } else {
                q20Var.a(null);
            }
        }
    }
}
