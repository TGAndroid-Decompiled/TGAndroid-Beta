package org.telegram.ui;
public final class to0 implements Runnable {
    public final PhotoViewer f52362a;

    public to0(PhotoViewer photoViewer) {
        this.f52362a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f52362a;
        org.telegram.messenger.fj fjVar = photoViewer.T4;
        if (fjVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(fjVar.K1).b0(photoViewer.T4.F0(), true, false);
    }
}
