package org.telegram.ui;
public final class uo0 implements Runnable {
    public final PhotoViewer f52608a;

    public uo0(PhotoViewer photoViewer) {
        this.f52608a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f52608a;
        org.telegram.messenger.gj gjVar = photoViewer.T4;
        if (gjVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(gjVar.K1).b0(photoViewer.T4.F0(), true, false);
    }
}
