package org.telegram.ui;

import android.graphics.Bitmap;
public final class us implements Runnable {
    public final int f43305a;
    public final ht f43306b;

    public us(ht htVar, int i9) {
        this.f43305a = i9;
        this.f43306b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f43305a) {
            case 0:
                this.f43306b.f38914c0 = null;
                return;
            case 1:
                ht htVar = this.f43306b;
                htVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.mc0 mc0Var = htVar.C;
                if (mc0Var != null) {
                    mc0Var.a();
                    htVar.f38936z.removeView(htVar.C);
                    htVar.C = null;
                    return;
                }
                return;
            default:
                this.f43306b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                return;
        }
    }
}
