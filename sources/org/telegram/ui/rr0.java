package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class rr0 implements org.telegram.ui.Components.s30 {
    public final PhotoViewer f42193a;

    public rr0(PhotoViewer photoViewer) {
        this.f42193a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f42193a;
        photoViewer.L4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f35698f5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f35698f5 = null;
        }
        photoViewer.f35716h5 = true;
        photoViewer.B2(i10);
        photoViewer.f35716h5 = false;
    }
}
