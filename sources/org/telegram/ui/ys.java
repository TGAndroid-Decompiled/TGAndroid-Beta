package org.telegram.ui;

import android.graphics.Bitmap;
public final class ys implements Runnable {
    public final int f40240a;
    public final nt f40241b;

    public ys(nt ntVar, int i10) {
        this.f40240a = i10;
        this.f40241b = ntVar;
    }

    @Override
    public final void run() {
        switch (this.f40240a) {
            case 0:
                this.f40241b.f35976c0 = null;
                return;
            case 1:
                nt ntVar = this.f40241b;
                ntVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.rd0 rd0Var = ntVar.C;
                if (rd0Var != null) {
                    rd0Var.a();
                    ntVar.f35997z.removeView(ntVar.C);
                    ntVar.C = null;
                    return;
                }
                return;
            default:
                this.f40241b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.sr.h).start();
                return;
        }
    }
}
