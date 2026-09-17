package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class us0 implements org.telegram.ui.Components.u30 {
    public final PhotoViewer f41243a;

    public us0(PhotoViewer photoViewer) {
        this.f41243a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f41243a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33625j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33625j5 = null;
        }
        photoViewer.f33641l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33641l5 = false;
    }
}
