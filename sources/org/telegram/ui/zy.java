package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class zy implements DownloadController.FileDownloadProgressListener {
    public long f42731a;
    public long f42732b;
    public final String f42733c;
    public final az d;

    public zy(az azVar, String str) {
        this.d = azVar;
        this.f42733c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f42732b = j10;
        this.f42731a = j11;
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
