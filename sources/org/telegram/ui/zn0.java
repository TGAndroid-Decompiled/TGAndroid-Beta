package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zn0 implements Runnable {
    public final int f52487a;
    public final PhotoViewer f52488b;

    public zn0(PhotoViewer photoViewer, int i7) {
        this.f52487a = i7;
        this.f52488b = photoViewer;
    }

    @Override
    public final void run() {
        int i7 = this.f52487a;
        PhotoViewer photoViewer = this.f52488b;
        switch (i7) {
            case 0:
                photoViewer.f41457m7 = null;
                return;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.x3();
                return;
            case 2:
                photoViewer.D1.e(photoViewer.I2, photoViewer.J2, photoViewer.K2, photoViewer.O2, photoViewer.Q2, photoViewer.N2, photoViewer.o2(true), photoViewer.o2(true), photoViewer.L2, photoViewer.M2, 0.0f, 0.0f, photoViewer.P2);
                photoViewer.b3(0);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.z0(true, false);
                return;
            case 4:
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer.c3(1, false);
                return;
            default:
                PhotoViewer.K(photoViewer);
                return;
        }
    }
}
