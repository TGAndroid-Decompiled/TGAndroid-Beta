package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class qs0 implements org.telegram.ui.Components.y30 {
    public final PhotoViewer f39814a;

    public qs0(PhotoViewer photoViewer) {
        this.f39814a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f39814a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33943j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33943j5 = null;
        }
        photoViewer.f33959l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33959l5 = false;
    }
}
