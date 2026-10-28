package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class rr0 implements Runnable {
    public final int f43158a;
    public final PhotoViewer f43159b;

    public rr0(PhotoViewer photoViewer, int i10) {
        this.f43158a = i10;
        this.f43159b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f43158a;
        PhotoViewer photoViewer = this.f43159b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.H0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.i3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.i3(-1, false);
                return;
            default:
                PhotoViewer.T(photoViewer);
                return;
        }
    }
}
