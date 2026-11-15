package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class rn0 implements Runnable {
    public final int f50982a;
    public final PhotoViewer f50983b;
    public final Bitmap f50984c;

    public rn0(PhotoViewer photoViewer, Bitmap bitmap, int i7) {
        this.f50982a = i7;
        this.f50983b = photoViewer;
        this.f50984c = bitmap;
    }

    @Override
    public final void run() {
        int i7 = this.f50982a;
        Bitmap bitmap = this.f50984c;
        PhotoViewer photoViewer = this.f50983b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                return;
            case 4:
                photoViewer.C4.v0(bitmap);
                photoViewer.f42889t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                return;
            case 5:
                photoViewer.C4.v0(bitmap);
                photoViewer.f42889t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                return;
            default:
                photoViewer.C4.v0(bitmap);
                photoViewer.f42889t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                return;
        }
    }
}
