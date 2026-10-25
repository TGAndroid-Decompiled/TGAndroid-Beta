package org.telegram.ui;

import android.graphics.Bitmap;
public final class ss implements Runnable {
    public final int f43581a;
    public final ft f43582b;

    public ss(ft ftVar, int i10) {
        this.f43581a = i10;
        this.f43582b = ftVar;
    }

    @Override
    public final void run() {
        switch (this.f43581a) {
            case 0:
                this.f43582b.f39448c0 = null;
                return;
            case 1:
                ft ftVar = this.f43582b;
                ftVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.yd0 yd0Var = ftVar.C;
                if (yd0Var != null) {
                    yd0Var.a();
                    ftVar.f39469z.removeView(ftVar.C);
                    ftVar.C = null;
                    return;
                }
                return;
            default:
                this.f43582b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                return;
        }
    }
}
