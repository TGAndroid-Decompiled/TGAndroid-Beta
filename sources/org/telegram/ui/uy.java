package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class uy implements DownloadController.FileDownloadProgressListener {
    public long f42578a;
    public long f42579b;
    public final String f42580c;
    public final vy d;

    public uy(vy vyVar, String str) {
        this.d = vyVar;
        this.f42580c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f42579b = j3;
        this.f42578a = j10;
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
