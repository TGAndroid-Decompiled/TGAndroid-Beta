package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class zr0 implements org.telegram.ui.Components.w30 {
    public final PhotoViewer f40856a;

    public zr0(PhotoViewer photoViewer) {
        this.f40856a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f40856a;
        photoViewer.M4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31755g5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31755g5 = null;
        }
        photoViewer.f31773i5 = true;
        photoViewer.B2(i10);
        photoViewer.f31773i5 = false;
    }
}
