package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zn0 implements Runnable {
    public final int f54672a;
    public final PhotoViewer f54673b;

    public zn0(PhotoViewer photoViewer, int i7) {
        this.f54672a = i7;
        this.f54673b = photoViewer;
    }

    @Override
    public final void run() {
        int i7 = this.f54672a;
        PhotoViewer photoViewer = this.f54673b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                this.f54673b.v2(false, 0, 0, true, false, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                photoViewer.Y2();
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                this.f54673b.v2(false, 0, 0, false, false, false);
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                photoViewer.z0(false, false);
                org.telegram.ui.Components.ti tiVar = photoViewer.f43294b2;
                if (tiVar != null) {
                    tiVar.a(true);
                }
                org.telegram.ui.ActionBar.g2 g2Var = photoViewer.f43396m4;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                photoViewer.f43461t7 = null;
                return;
            case 5:
                Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                photoViewer.z0(true, false);
                return;
            default:
                PhotoViewer.L(photoViewer);
                return;
        }
    }
}
