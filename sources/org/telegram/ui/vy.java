package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class vy implements DownloadController.FileDownloadProgressListener {
    public long f41709a;
    public long f41710b;
    public final String f41711c;
    public final wy d;

    public vy(wy wyVar, String str) {
        this.d = wyVar;
        this.f41711c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f41710b = j3;
        this.f41709a = j10;
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
