package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class qs0 implements org.telegram.ui.Components.y30 {
    public final PhotoViewer f39819a;

    public qs0(PhotoViewer photoViewer) {
        this.f39819a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f39819a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33949j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33949j5 = null;
        }
        photoViewer.f33965l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33965l5 = false;
    }
}
