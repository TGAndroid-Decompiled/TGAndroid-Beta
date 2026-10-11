package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zr0 implements Runnable {
    public final int f45061a;
    public final PhotoViewer f45062b;

    public zr0(PhotoViewer photoViewer, int i10) {
        this.f45061a = i10;
        this.f45062b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f45061a;
        PhotoViewer photoViewer = this.f45062b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.G0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.f3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.f3(-1, false);
                return;
            default:
                PhotoViewer.S(photoViewer);
                return;
        }
    }
}
