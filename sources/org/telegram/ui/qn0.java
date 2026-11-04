package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class qn0 implements Runnable {
    public final int f48918a;
    public final PhotoViewer f48919b;

    public qn0(PhotoViewer photoViewer, int i3) {
        this.f48918a = i3;
        this.f48919b = photoViewer;
    }

    @Override
    public final void run() {
        int i3 = this.f48918a;
        PhotoViewer photoViewer = this.f48919b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.H0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer.i3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer.i3(-1, false);
                return;
            default:
                PhotoViewer.S(photoViewer);
                return;
        }
    }
}
