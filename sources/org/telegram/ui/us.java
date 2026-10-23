package org.telegram.ui;

import android.graphics.Bitmap;
public final class us implements Runnable {
    public final int f42496a;
    public final ht f42497b;

    public us(ht htVar, int i10) {
        this.f42496a = i10;
        this.f42497b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f42496a) {
            case 0:
                this.f42497b.f37937c0 = null;
                return;
            case 1:
                ht htVar = this.f42497b;
                htVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.ce0 ce0Var = htVar.C;
                if (ce0Var != null) {
                    ce0Var.a();
                    htVar.f37958z.removeView(htVar.C);
                    htVar.C = null;
                    return;
                }
                return;
            default:
                this.f42497b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                return;
        }
    }
}
