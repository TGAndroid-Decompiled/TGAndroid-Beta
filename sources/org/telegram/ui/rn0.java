package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class rn0 implements Runnable {
    public final int f49545a;
    public final PhotoViewer f49546b;
    public final Bitmap f49547c;

    public rn0(PhotoViewer photoViewer, Bitmap bitmap, int i7) {
        this.f49545a = i7;
        this.f49546b = photoViewer;
        this.f49547c = bitmap;
    }

    @Override
    public final void run() {
        int i7 = this.f49545a;
        Bitmap bitmap = this.f49547c;
        PhotoViewer photoViewer = this.f49546b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 4));
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
