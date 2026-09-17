package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class xs0 implements org.telegram.ui.Components.u30 {
    public final PhotoViewer f39694a;

    public xs0(PhotoViewer photoViewer) {
        this.f39694a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f39694a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f30998j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f30998j5 = null;
        }
        photoViewer.f31014l5 = true;
        photoViewer.B2(i10);
        photoViewer.f31014l5 = false;
    }
}
