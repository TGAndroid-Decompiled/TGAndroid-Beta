package org.telegram.ui;

import android.graphics.Bitmap;
public final class ts implements Runnable {
    public final int f41791a;
    public final gt f41792b;

    public ts(gt gtVar, int i10) {
        this.f41791a = i10;
        this.f41792b = gtVar;
    }

    @Override
    public final void run() {
        switch (this.f41791a) {
            case 0:
                this.f41792b.f37295c0 = null;
                return;
            case 1:
                gt gtVar = this.f41792b;
                gtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = gtVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    gtVar.f37316z.removeView(gtVar.C);
                    gtVar.C = null;
                    return;
                }
                return;
            default:
                this.f41792b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                return;
        }
    }
}
