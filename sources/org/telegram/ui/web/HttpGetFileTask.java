package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.File;
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private pcc doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private pcc progressCallback;

    public HttpGetFileTask(pcc pccVar, pcc pccVar2) {
        this.doneCallback = pccVar;
        this.progressCallback = pccVar2;
    }

    public void lambda$doInBackground$0(float f) {
        this.progressCallback.a(Float.valueOf(f));
    }

    public void lambda$doInBackground$1() {
        this.progressCallback.a(Float.valueOf(1.0f));
    }

    @Override
    public java.io.File doInBackground(java.lang.String... r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.HttpGetFileTask.doInBackground(java.lang.String[]):java.io.File");
    }

    @Override
    public void onPostExecute(File file) {
        pcc pccVar = this.doneCallback;
        if (pccVar != null) {
            if (this.exception == null) {
                pccVar.a(file);
            } else {
                pccVar.a(null);
            }
        }
    }

    public HttpGetFileTask setDestFile(File file) {
        this.file = file;
        return this;
    }

    public HttpGetFileTask setMaxSize(long j) {
        this.max_size = j;
        return this;
    }

    public HttpGetFileTask setOverrideExtension(String str) {
        this.overrideExt = str;
        return this;
    }
}
