package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class uy implements DownloadController.FileDownloadProgressListener {
    public long f38376a;
    public long f38377b;
    public final String f38378c;
    public final vy d;

    public uy(vy vyVar, String str) {
        this.d = vyVar;
        this.f38378c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f38377b = j3;
        this.f38376a = j10;
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
