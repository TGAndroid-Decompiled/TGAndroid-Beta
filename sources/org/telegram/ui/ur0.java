package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ur0 implements Runnable {
    public final int f38210a;
    public final PhotoViewer f38211b;

    public ur0(PhotoViewer photoViewer, int i10) {
        this.f38210a = i10;
        this.f38211b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f38210a;
        PhotoViewer photoViewer = this.f38211b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.G0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.e3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.e3(-1, false);
                return;
            default:
                PhotoViewer.S(photoViewer);
                return;
        }
    }
}
