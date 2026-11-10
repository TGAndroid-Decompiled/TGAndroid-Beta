package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class sn0 implements Runnable {
    public final int f49899a;
    public final PhotoViewer f49900b;
    public final Bitmap f49901c;

    public sn0(PhotoViewer photoViewer, Bitmap bitmap, int i7) {
        this.f49899a = i7;
        this.f49900b = photoViewer;
        this.f49901c = bitmap;
    }

    @Override
    public final void run() {
        int i7 = this.f49899a;
        Bitmap bitmap = this.f49901c;
        PhotoViewer photoViewer = this.f49900b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new sn0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new sn0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new sn0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                return;
            case 4:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                return;
            case 5:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                return;
            default:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                return;
        }
    }
}
