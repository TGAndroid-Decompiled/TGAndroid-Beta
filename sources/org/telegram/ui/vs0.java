package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class vs0 implements org.telegram.ui.Components.u30 {
    public final PhotoViewer f38615a;

    public vs0(PhotoViewer photoViewer) {
        this.f38615a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f38615a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f30982j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f30982j5 = null;
        }
        photoViewer.f30998l5 = true;
        photoViewer.A2(i10);
        photoViewer.f30998l5 = false;
    }
}
