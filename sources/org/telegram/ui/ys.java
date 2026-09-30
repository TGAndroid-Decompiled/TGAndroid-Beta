package org.telegram.ui;

import android.graphics.Bitmap;
public final class ys implements Runnable {
    public final int f40351a;
    public final nt f40352b;

    public ys(nt ntVar, int i10) {
        this.f40351a = i10;
        this.f40352b = ntVar;
    }

    @Override
    public final void run() {
        switch (this.f40351a) {
            case 0:
                this.f40352b.f36115c0 = null;
                return;
            case 1:
                nt ntVar = this.f40352b;
                ntVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.td0 td0Var = ntVar.C;
                if (td0Var != null) {
                    td0Var.a();
                    ntVar.f36136z.removeView(ntVar.C);
                    ntVar.C = null;
                    return;
                }
                return;
            default:
                this.f40352b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.tr.h).start();
                return;
        }
    }
}
