package org.telegram.ui;
public final class so0 implements Runnable {
    public final PhotoViewer f49798a;

    public so0(PhotoViewer photoViewer) {
        this.f49798a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f49798a;
        org.telegram.messenger.ij ijVar = photoViewer.S4;
        if (ijVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(ijVar.I1).b0(photoViewer.S4.F0(), true, false);
    }
}
