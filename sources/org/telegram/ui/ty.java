package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class ty implements DownloadController.FileDownloadProgressListener {
    public long f42290a;
    public long f42291b;
    public final String f42292c;
    public final uy d;

    public ty(uy uyVar, String str) {
        this.d = uyVar;
        this.f42292c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f42291b = j3;
        this.f42290a = j10;
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
