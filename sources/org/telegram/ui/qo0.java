package org.telegram.ui;
public final class qo0 implements Runnable {
    public final PhotoViewer f50702a;

    public qo0(PhotoViewer photoViewer) {
        this.f50702a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f50702a;
        org.telegram.messenger.gj gjVar = photoViewer.T4;
        if (gjVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(gjVar.K1).b0(photoViewer.T4.F0(), true, false);
    }
}
