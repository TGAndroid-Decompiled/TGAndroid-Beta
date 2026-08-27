package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

public final class tr0 implements org.telegram.ui.Components.j30 {

    public final PhotoViewer f43000a;

    public tr0(PhotoViewer photoViewer) {
        this.f43000a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f43000a;
        photoViewer.L4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f35635f5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f35635f5 = null;
        }
        photoViewer.f35653h5 = true;
        photoViewer.B2(i10);
        photoViewer.f35653h5 = false;
    }
}
