package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class yq0 implements Runnable {
    public final int f44931a;
    public final PhotoViewer f44932b;

    public yq0(PhotoViewer photoViewer, int i9) {
        this.f44931a = i9;
        this.f44932b = photoViewer;
    }

    @Override
    public final void run() {
        int i9 = this.f44931a;
        PhotoViewer photoViewer = this.f44932b;
        switch (i9) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.F0(true, false);
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
                PhotoViewer.R(photoViewer);
                return;
        }
    }
}
