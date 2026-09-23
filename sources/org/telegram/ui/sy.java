package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class sy implements DownloadController.FileDownloadProgressListener {
    public long f37458a;
    public long f37459b;
    public final String f37460c;
    public final ty d;

    public sy(ty tyVar, String str) {
        this.d = tyVar;
        this.f37460c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f37459b = j3;
        this.f37458a = j10;
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
