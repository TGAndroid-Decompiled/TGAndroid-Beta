package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class us0 implements org.telegram.ui.Components.e40 {
    public final PhotoViewer f37337a;

    public us0(PhotoViewer photoViewer) {
        this.f37337a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f37337a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f30097j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f30097j5 = null;
        }
        photoViewer.f30113l5 = true;
        photoViewer.B2(i10);
        photoViewer.f30113l5 = false;
    }
}
