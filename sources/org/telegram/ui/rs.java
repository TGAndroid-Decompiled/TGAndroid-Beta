package org.telegram.ui;

import android.graphics.Bitmap;
public final class rs implements Runnable {
    public final int f41269a;
    public final et f41270b;

    public rs(et etVar, int i10) {
        this.f41269a = i10;
        this.f41270b = etVar;
    }

    @Override
    public final void run() {
        switch (this.f41269a) {
            case 0:
                this.f41270b.f36772c0 = null;
                return;
            case 1:
                et etVar = this.f41270b;
                etVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = etVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    etVar.f36793z.removeView(etVar.C);
                    etVar.C = null;
                    return;
                }
                return;
            default:
                this.f41270b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                return;
        }
    }
}
