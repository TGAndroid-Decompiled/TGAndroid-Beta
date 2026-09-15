package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class vs0 implements org.telegram.ui.Components.u30 {
    public final PhotoViewer f38679a;

    public vs0(PhotoViewer photoViewer) {
        this.f38679a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f38679a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f30984j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f30984j5 = null;
        }
        photoViewer.f31000l5 = true;
        photoViewer.B2(i10);
        photoViewer.f31000l5 = false;
    }
}
