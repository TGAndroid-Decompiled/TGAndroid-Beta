package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class us0 implements org.telegram.ui.Components.u30 {
    public final PhotoViewer f41242a;

    public us0(PhotoViewer photoViewer) {
        this.f41242a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f41242a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33624j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33624j5 = null;
        }
        photoViewer.f33640l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33640l5 = false;
    }
}
