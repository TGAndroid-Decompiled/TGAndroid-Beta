package org.telegram.ui;

import android.graphics.Bitmap;
public final class ys implements Runnable {
    public final int f40241a;
    public final nt f40242b;

    public ys(nt ntVar, int i10) {
        this.f40241a = i10;
        this.f40242b = ntVar;
    }

    @Override
    public final void run() {
        switch (this.f40241a) {
            case 0:
                this.f40242b.f35977c0 = null;
                return;
            case 1:
                nt ntVar = this.f40242b;
                ntVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.qd0 qd0Var = ntVar.C;
                if (qd0Var != null) {
                    qd0Var.a();
                    ntVar.f35998z.removeView(ntVar.C);
                    ntVar.C = null;
                    return;
                }
                return;
            default:
                this.f40242b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                return;
        }
    }
}
