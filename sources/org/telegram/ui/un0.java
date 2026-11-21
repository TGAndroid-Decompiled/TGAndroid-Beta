package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class un0 implements Runnable {
    public final int f52605a;
    public final PhotoViewer f52606b;
    public final Bitmap f52607c;

    public un0(PhotoViewer photoViewer, Bitmap bitmap, int i7) {
        this.f52605a = i7;
        this.f52606b = photoViewer;
        this.f52607c = bitmap;
    }

    @Override
    public final void run() {
        int i7 = this.f52605a;
        Bitmap bitmap = this.f52607c;
        PhotoViewer photoViewer = this.f52606b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.g3(new un0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.g3(new un0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.g3(new un0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                return;
            case 4:
                photoViewer.C4.v0(bitmap);
                photoViewer.f43375t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                return;
            case 5:
                photoViewer.C4.v0(bitmap);
                photoViewer.f43375t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                return;
            default:
                photoViewer.C4.v0(bitmap);
                photoViewer.f43375t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                return;
        }
    }
}
