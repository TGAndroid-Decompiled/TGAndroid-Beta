package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class vy implements DownloadController.FileDownloadProgressListener {
    public long f41858a;
    public long f41859b;
    public final String f41860c;
    public final wy d;

    public vy(wy wyVar, String str) {
        this.d = wyVar;
        this.f41860c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f41859b = j3;
        this.f41858a = j10;
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
