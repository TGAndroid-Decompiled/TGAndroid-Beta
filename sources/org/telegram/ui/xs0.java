package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class xs0 implements org.telegram.ui.Components.o40 {
    public final PhotoViewer f44160a;

    public xs0(PhotoViewer photoViewer) {
        this.f44160a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f44160a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33791j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33791j5 = null;
        }
        photoViewer.f33807l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33807l5 = false;
    }
}
