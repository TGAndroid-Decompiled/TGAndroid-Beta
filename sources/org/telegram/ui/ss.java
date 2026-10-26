package org.telegram.ui;

import android.graphics.Bitmap;
public final class ss implements Runnable {
    public final int f43584a;
    public final ft f43585b;

    public ss(ft ftVar, int i10) {
        this.f43584a = i10;
        this.f43585b = ftVar;
    }

    @Override
    public final void run() {
        switch (this.f43584a) {
            case 0:
                this.f43585b.f39451c0 = null;
                return;
            case 1:
                ft ftVar = this.f43585b;
                ftVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.yd0 yd0Var = ftVar.C;
                if (yd0Var != null) {
                    yd0Var.a();
                    ftVar.f39472z.removeView(ftVar.C);
                    ftVar.C = null;
                    return;
                }
                return;
            default:
                this.f43585b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                return;
        }
    }
}
