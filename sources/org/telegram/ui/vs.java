package org.telegram.ui;

import android.graphics.Bitmap;

public final class vs implements Runnable {

    public final int f43517a;

    public final kt f43518b;

    public vs(kt ktVar, int i10) {
        this.f43517a = i10;
        this.f43518b = ktVar;
    }

    @Override
    public final void run() {
        switch (this.f43517a) {
            case 0:
                this.f43518b.f39859c0 = null;
                break;
            case 1:
                kt ktVar = this.f43518b;
                ktVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.rc0 rc0Var = ktVar.C;
                if (rc0Var != null) {
                    rc0Var.a();
                    ktVar.f39881z.removeView(ktVar.C);
                    ktVar.C = null;
                }
                break;
            default:
                this.f43518b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
                break;
        }
    }
}
