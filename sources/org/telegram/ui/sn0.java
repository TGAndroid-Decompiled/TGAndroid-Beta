package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class sn0 implements Runnable {
    public final int f52116a;
    public final PhotoViewer f52117b;
    public final Bitmap f52118c;

    public sn0(PhotoViewer photoViewer, Bitmap bitmap, int i7) {
        this.f52116a = i7;
        this.f52117b = photoViewer;
        this.f52118c = bitmap;
    }

    @Override
    public final void run() {
        int i7 = this.f52116a;
        Bitmap bitmap = this.f52118c;
        PhotoViewer photoViewer = this.f52117b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.g3(new sn0(photoViewer, bitmap, 5));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.g3(new sn0(photoViewer, bitmap, 4));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.g3(new sn0(photoViewer, bitmap, 6));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                photoViewer.g0(bitmap);
                return;
            case 4:
                photoViewer.C4.w0(bitmap);
                photoViewer.f43460t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
            case 5:
                photoViewer.C4.w0(bitmap);
                photoViewer.f43460t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
            default:
                photoViewer.C4.w0(bitmap);
                photoViewer.f43460t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
        }
    }
}
