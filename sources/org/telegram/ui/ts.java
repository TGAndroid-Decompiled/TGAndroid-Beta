package org.telegram.ui;

import android.graphics.Bitmap;
public final class ts implements Runnable {
    public final int f41817a;
    public final gt f41818b;

    public ts(gt gtVar, int i10) {
        this.f41817a = i10;
        this.f41818b = gtVar;
    }

    @Override
    public final void run() {
        switch (this.f41817a) {
            case 0:
                this.f41818b.f37314c0 = null;
                return;
            case 1:
                gt gtVar = this.f41818b;
                gtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = gtVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    gtVar.f37335z.removeView(gtVar.C);
                    gtVar.C = null;
                    return;
                }
                return;
            default:
                this.f41818b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                return;
        }
    }
}
