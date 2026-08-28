package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class sr0 implements org.telegram.ui.Components.e30 {
    public final PhotoViewer f42756a;

    public sr0(PhotoViewer photoViewer) {
        this.f42756a = photoViewer;
    }

    public final void a(int i9) {
        PhotoViewer photoViewer = this.f42756a;
        photoViewer.L4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f35632f5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f35632f5 = null;
        }
        photoViewer.f35650h5 = true;
        photoViewer.B2(i9);
        photoViewer.f35650h5 = false;
    }
}
