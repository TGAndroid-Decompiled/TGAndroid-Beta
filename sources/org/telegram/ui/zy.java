package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class zy implements DownloadController.FileDownloadProgressListener {
    public long f42435a;
    public long f42436b;
    public final String f42437c;
    public final az d;

    public zy(az azVar, String str) {
        this.d = azVar;
        this.f42437c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f42436b = j10;
        this.f42435a = j11;
        this.d.c();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
