package org.telegram.ui;

import android.graphics.Bitmap;
public final class ys implements Runnable {
    public final int f40225a;
    public final nt f40226b;

    public ys(nt ntVar, int i10) {
        this.f40225a = i10;
        this.f40226b = ntVar;
    }

    @Override
    public final void run() {
        switch (this.f40225a) {
            case 0:
                this.f40226b.f35953c0 = null;
                return;
            case 1:
                nt ntVar = this.f40226b;
                ntVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.qd0 qd0Var = ntVar.C;
                if (qd0Var != null) {
                    qd0Var.a();
                    ntVar.f35974z.removeView(ntVar.C);
                    ntVar.C = null;
                    return;
                }
                return;
            default:
                this.f40226b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                return;
        }
    }
}
