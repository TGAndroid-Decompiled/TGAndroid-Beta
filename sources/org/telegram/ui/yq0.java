package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class yq0 implements Runnable {
    public final int f44955a;
    public final PhotoViewer f44956b;

    public yq0(PhotoViewer photoViewer, int i10) {
        this.f44955a = i10;
        this.f44956b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f44955a;
        PhotoViewer photoViewer = this.f44956b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.G0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.f3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.f3(-1, false);
                return;
            default:
                PhotoViewer.S(photoViewer);
                return;
        }
    }
}
