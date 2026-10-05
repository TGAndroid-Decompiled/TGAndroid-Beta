package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class qs0 implements org.telegram.ui.Components.y30 {
    public final PhotoViewer f39880a;

    public qs0(PhotoViewer photoViewer) {
        this.f39880a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f39880a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33962j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33962j5 = null;
        }
        photoViewer.f33978l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33978l5 = false;
    }
}
