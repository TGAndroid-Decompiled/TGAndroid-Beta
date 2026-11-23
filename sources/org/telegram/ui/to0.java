package org.telegram.ui;
public final class to0 implements Runnable {
    public final PhotoViewer f52366a;

    public to0(PhotoViewer photoViewer) {
        this.f52366a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f52366a;
        org.telegram.messenger.gj gjVar = photoViewer.T4;
        if (gjVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(gjVar.K1).b0(photoViewer.T4.F0(), true, false);
    }
}
