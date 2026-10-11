package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class us0 implements org.telegram.ui.Components.m40 {
    public final PhotoViewer f42797a;

    public us0(PhotoViewer photoViewer) {
        this.f42797a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f42797a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f34014j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f34014j5 = null;
        }
        photoViewer.f34030l5 = true;
        photoViewer.B2(i10);
        photoViewer.f34030l5 = false;
    }
}
