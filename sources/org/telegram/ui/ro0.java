package org.telegram.ui;
public final class ro0 implements Runnable {
    public final PhotoViewer f49523a;

    public ro0(PhotoViewer photoViewer) {
        this.f49523a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f49523a;
        org.telegram.messenger.ij ijVar = photoViewer.S4;
        if (ijVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(ijVar.I1).c0(photoViewer.S4.F0(), true, false);
    }
}
