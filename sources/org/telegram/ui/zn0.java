package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zn0 implements Runnable {
    public final int f54610a;
    public final PhotoViewer f54611b;

    public zn0(PhotoViewer photoViewer, int i7) {
        this.f54610a = i7;
        this.f54611b = photoViewer;
    }

    @Override
    public final void run() {
        int i7 = this.f54610a;
        PhotoViewer photoViewer = this.f54611b;
        switch (i7) {
            case 0:
                photoViewer.f43327n7 = null;
                return;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.y3();
                return;
            case 2:
                photoViewer.E1.e(photoViewer.J2, photoViewer.K2, photoViewer.L2, photoViewer.P2, photoViewer.R2, photoViewer.O2, photoViewer.p2(true), photoViewer.p2(true), photoViewer.M2, photoViewer.N2, 0.0f, 0.0f, photoViewer.Q2);
                photoViewer.c3(0);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.z0(true, false);
                return;
            case 4:
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer.d3(1, false);
                return;
            default:
                PhotoViewer.L(photoViewer);
                return;
        }
    }
}
