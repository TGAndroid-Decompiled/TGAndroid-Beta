package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class tr0 implements Runnable {
    public final int f38231a;
    public final PhotoViewer f38232b;

    public tr0(PhotoViewer photoViewer, int i10) {
        this.f38231a = i10;
        this.f38232b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f38231a;
        PhotoViewer photoViewer = this.f38232b;
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
