package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class qy implements DownloadController.FileDownloadProgressListener {
    public long f40711a;
    public long f40712b;
    public final String f40713c;
    public final ry d;

    public qy(ry ryVar, String str) {
        this.d = ryVar;
        this.f40713c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f40712b = j10;
        this.f40711a = j11;
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
