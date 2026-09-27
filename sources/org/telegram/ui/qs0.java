package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class qs0 implements org.telegram.ui.Components.x30 {
    public final PhotoViewer f36880a;

    public qs0(PhotoViewer photoViewer) {
        this.f36880a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f36880a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31273j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31273j5 = null;
        }
        photoViewer.f31289l5 = true;
        photoViewer.A2(i10);
        photoViewer.f31289l5 = false;
    }
}
