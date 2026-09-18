package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class vs0 implements org.telegram.ui.Components.u30 {
    public final PhotoViewer f38616a;

    public vs0(PhotoViewer photoViewer) {
        this.f38616a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f38616a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31229j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31229j5 = null;
        }
        photoViewer.f31245l5 = true;
        photoViewer.A2(i10);
        photoViewer.f31245l5 = false;
    }
}
