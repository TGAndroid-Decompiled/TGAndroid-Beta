package org.telegram.ui;

import android.graphics.Bitmap;
public final class ts implements Runnable {
    public final int f43092a;
    public final ht f43093b;

    public ts(ht htVar, int i10) {
        this.f43092a = i10;
        this.f43093b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f43092a) {
            case 0:
                this.f43093b.f39023c0 = null;
                return;
            case 1:
                ht htVar = this.f43093b;
                htVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.bd0 bd0Var = htVar.C;
                if (bd0Var != null) {
                    bd0Var.a();
                    htVar.f39045z.removeView(htVar.C);
                    htVar.C = null;
                    return;
                }
                return;
            default:
                this.f43093b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.jr.h).start();
                return;
        }
    }
}
