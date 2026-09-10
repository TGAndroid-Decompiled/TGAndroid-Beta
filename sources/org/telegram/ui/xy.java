package org.telegram.ui;

import org.telegram.messenger.DownloadController;
public final class xy implements DownloadController.FileDownloadProgressListener {
    public long f38837a;
    public long f38838b;
    public final String f38839c;
    public final yy d;

    public xy(yy yyVar, String str) {
        this.d = yyVar;
        this.f38839c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f38838b = j3;
        this.f38837a = j10;
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
