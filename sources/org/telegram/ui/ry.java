package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class ry implements DownloadController.FileDownloadProgressListener {
    public long f38071a;
    public long f38072b;
    public final String f38073c;
    public final sy d;

    public ry(sy syVar, String str) {
        this.d = syVar;
        this.f38073c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f38072b = j10;
        this.f38071a = j11;
        this.d.c();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
