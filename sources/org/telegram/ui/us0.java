package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class us0 implements org.telegram.ui.Components.m40 {
    public final PhotoViewer f42763a;

    public us0(PhotoViewer photoViewer) {
        this.f42763a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f42763a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33980j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33980j5 = null;
        }
        photoViewer.f33996l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33996l5 = false;
    }
}
