package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class vr0 implements Runnable {
    public final int f41807a;
    public final PhotoViewer f41808b;

    public vr0(PhotoViewer photoViewer, int i10) {
        this.f41807a = i10;
        this.f41808b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f41807a;
        PhotoViewer photoViewer = this.f41808b;
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
                PhotoViewer.Q(photoViewer);
                return;
        }
    }
}
