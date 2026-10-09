package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class vs0 implements org.telegram.ui.Components.l40 {
    public final PhotoViewer f42977a;

    public vs0(PhotoViewer photoViewer) {
        this.f42977a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f42977a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33952j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33952j5 = null;
        }
        photoViewer.f33968l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33968l5 = false;
    }
}
