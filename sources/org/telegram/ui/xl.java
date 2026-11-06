package org.telegram.ui;

import android.graphics.RectF;
public final class xl implements Runnable {
    public final int f51905a;
    public final org.telegram.ui.Cells.q1 f51906b;
    public final RectF f51907c;

    public xl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f51905a = i7;
        this.f51906b = q1Var;
        this.f51907c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f51905a) {
            case 0:
                org.telegram.messenger.g0.i3(new xl(this.f51906b, this.f51907c, 1), 400L);
                return;
            default:
                RectF rectF = this.f51907c;
                org.telegram.ui.Cells.q1 q1Var = this.f51906b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
