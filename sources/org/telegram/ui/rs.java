package org.telegram.ui;

import android.graphics.Bitmap;
public final class rs implements Runnable {
    public final int f41275a;
    public final et f41276b;

    public rs(et etVar, int i10) {
        this.f41275a = i10;
        this.f41276b = etVar;
    }

    @Override
    public final void run() {
        switch (this.f41275a) {
            case 0:
                this.f41276b.f36779c0 = null;
                return;
            case 1:
                et etVar = this.f41276b;
                etVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = etVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    etVar.f36800z.removeView(etVar.C);
                    etVar.C = null;
                    return;
                }
                return;
            default:
                this.f41276b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                return;
        }
    }
}
