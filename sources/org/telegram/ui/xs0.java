package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class xs0 implements org.telegram.ui.Components.u30 {
    public final PhotoViewer f39699a;

    public xs0(PhotoViewer photoViewer) {
        this.f39699a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f39699a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31002j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31002j5 = null;
        }
        photoViewer.f31018l5 = true;
        photoViewer.A2(i10);
        photoViewer.f31018l5 = false;
    }
}
