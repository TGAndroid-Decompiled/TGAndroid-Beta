package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class vr0 implements Runnable {
    public final int f41814a;
    public final PhotoViewer f41815b;

    public vr0(PhotoViewer photoViewer, int i10) {
        this.f41814a = i10;
        this.f41815b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f41814a;
        PhotoViewer photoViewer = this.f41815b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.G0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.f3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.f3(-1, false);
                return;
            default:
                PhotoViewer.Q(photoViewer);
                return;
        }
    }
}
