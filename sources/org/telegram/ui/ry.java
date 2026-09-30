package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class ry implements DownloadController.FileDownloadProgressListener {
    public long f37535a;
    public long f37536b;
    public final String f37537c;
    public final sy d;

    public ry(sy syVar, String str) {
        this.d = syVar;
        this.f37537c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f37536b = j3;
        this.f37535a = j10;
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
