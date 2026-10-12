package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class wy implements DownloadController.FileDownloadProgressListener {
    public long f43691a;
    public long f43692b;
    public final String f43693c;
    public final xy d;

    public wy(xy xyVar, String str) {
        this.d = xyVar;
        this.f43693c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f43692b = j3;
        this.f43691a = j10;
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
