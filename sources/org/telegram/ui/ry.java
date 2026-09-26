package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class ry implements DownloadController.FileDownloadProgressListener {
    public long f37534a;
    public long f37535b;
    public final String f37536c;
    public final sy d;

    public ry(sy syVar, String str) {
        this.d = syVar;
        this.f37536c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f37535b = j3;
        this.f37534a = j10;
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
