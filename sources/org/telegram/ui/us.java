package org.telegram.ui;

import android.graphics.Bitmap;
public final class us implements Runnable {
    public final int f44098a;
    public final ht f44099b;

    public us(ht htVar, int i10) {
        this.f44098a = i10;
        this.f44099b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f44098a) {
            case 0:
                this.f44099b.f39966c0 = null;
                return;
            case 1:
                ht htVar = this.f44099b;
                htVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = htVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    htVar.f39987z.removeView(htVar.C);
                    htVar.C = null;
                    return;
                }
                return;
            default:
                this.f44099b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                return;
        }
    }
}
