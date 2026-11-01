package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class zo0 implements Runnable {
    public final int f44031a;
    public final PhotoViewer f44032b;
    public final Bitmap f44033c;

    public zo0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f44031a = i10;
        this.f44032b = photoViewer;
        this.f44033c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f44031a;
        Bitmap bitmap = this.f44033c;
        PhotoViewer photoViewer = this.f44032b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.i0.g3(new zo0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.i0.g3(new zo0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.i0.g3(new zo0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                return;
            case 4:
                photoViewer.C4.v0(bitmap);
                photoViewer.f33614t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
            case 5:
                photoViewer.C4.v0(bitmap);
                photoViewer.f33614t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
            default:
                photoViewer.C4.v0(bitmap);
                photoViewer.f33614t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
        }
    }
}
