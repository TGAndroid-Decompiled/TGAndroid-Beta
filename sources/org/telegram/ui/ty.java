package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class ty implements DownloadController.FileDownloadProgressListener {
    public long f42324a;
    public long f42325b;
    public final String f42326c;
    public final uy d;

    public ty(uy uyVar, String str) {
        this.d = uyVar;
        this.f42326c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f42325b = j3;
        this.f42324a = j10;
        this.d.c();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
