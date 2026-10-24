package org.telegram.ui;

import android.graphics.Bitmap;
public final class us implements Runnable {
    public final int f42482a;
    public final ht f42483b;

    public us(ht htVar, int i10) {
        this.f42482a = i10;
        this.f42483b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f42482a) {
            case 0:
                this.f42483b.f37988c0 = null;
                return;
            case 1:
                ht htVar = this.f42483b;
                htVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.ae0 ae0Var = htVar.C;
                if (ae0Var != null) {
                    ae0Var.a();
                    htVar.f38009z.removeView(htVar.C);
                    htVar.C = null;
                    return;
                }
                return;
            default:
                this.f42483b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.zr.h).start();
                return;
        }
    }
}
