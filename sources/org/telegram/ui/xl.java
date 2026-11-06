package org.telegram.ui;

import android.graphics.RectF;
public final class xl implements Runnable {
    public final int f51888a;
    public final org.telegram.ui.Cells.q1 f51889b;
    public final RectF f51890c;

    public xl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f51888a = i7;
        this.f51889b = q1Var;
        this.f51890c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f51888a) {
            case 0:
                org.telegram.messenger.g0.i3(new xl(this.f51889b, this.f51890c, 1), 400L);
                return;
            default:
                RectF rectF = this.f51890c;
                org.telegram.ui.Cells.q1 q1Var = this.f51889b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
