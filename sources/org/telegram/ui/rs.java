package org.telegram.ui;

import android.graphics.Bitmap;
public final class rs implements Runnable {
    public final int f41279a;
    public final et f41280b;

    public rs(et etVar, int i10) {
        this.f41279a = i10;
        this.f41280b = etVar;
    }

    @Override
    public final void run() {
        switch (this.f41279a) {
            case 0:
                this.f41280b.f36783c0 = null;
                return;
            case 1:
                et etVar = this.f41280b;
                etVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = etVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    etVar.f36804z.removeView(etVar.C);
                    etVar.C = null;
                    return;
                }
                return;
            default:
                this.f41280b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                return;
        }
    }
}
