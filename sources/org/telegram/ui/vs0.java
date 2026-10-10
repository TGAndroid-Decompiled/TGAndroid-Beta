package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class vs0 implements org.telegram.ui.Components.m40 {
    public final PhotoViewer f43021a;

    public vs0(PhotoViewer photoViewer) {
        this.f43021a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f43021a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33990j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33990j5 = null;
        }
        photoViewer.f34006l5 = true;
        photoViewer.B2(i10);
        photoViewer.f34006l5 = false;
    }
}
