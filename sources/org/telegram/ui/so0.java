package org.telegram.ui;
public final class so0 implements Runnable {
    public final PhotoViewer f52122a;

    public so0(PhotoViewer photoViewer) {
        this.f52122a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f52122a;
        org.telegram.messenger.fj fjVar = photoViewer.T4;
        if (fjVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(fjVar.K1).b0(photoViewer.T4.F0(), true, false);
    }
}
