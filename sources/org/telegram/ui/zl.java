package org.telegram.ui;

import android.graphics.RectF;
public final class zl implements Runnable {
    public final int f52483a;
    public final org.telegram.ui.Cells.q1 f52484b;
    public final RectF f52485c;

    public zl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f52483a = i7;
        this.f52484b = q1Var;
        this.f52485c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f52483a) {
            case 0:
                org.telegram.messenger.g0.i3(new zl(this.f52484b, this.f52485c, 1), 400L);
                return;
            default:
                RectF rectF = this.f52485c;
                org.telegram.ui.Cells.q1 q1Var = this.f52484b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
