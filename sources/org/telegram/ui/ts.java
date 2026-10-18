package org.telegram.ui;

import android.graphics.Bitmap;
public final class ts implements Runnable {
    public final int f41832a;
    public final gt f41833b;

    public ts(gt gtVar, int i10) {
        this.f41832a = i10;
        this.f41833b = gtVar;
    }

    @Override
    public final void run() {
        switch (this.f41832a) {
            case 0:
                this.f41833b.f37333c0 = null;
                return;
            case 1:
                gt gtVar = this.f41833b;
                gtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = gtVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    gtVar.f37354z.removeView(gtVar.C);
                    gtVar.C = null;
                    return;
                }
                return;
            default:
                this.f41833b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                return;
        }
    }
}
