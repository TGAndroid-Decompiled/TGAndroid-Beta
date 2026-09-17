package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class vy implements DownloadController.FileDownloadProgressListener {
    public long f41710a;
    public long f41711b;
    public final String f41712c;
    public final wy d;

    public vy(wy wyVar, String str) {
        this.d = wyVar;
        this.f41712c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f41711b = j3;
        this.f41710a = j10;
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
