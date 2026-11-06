package org.telegram.ui;

import android.graphics.RectF;
public final class xl implements Runnable {
    public final int f51903a;
    public final org.telegram.ui.Cells.q1 f51904b;
    public final RectF f51905c;

    public xl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f51903a = i7;
        this.f51904b = q1Var;
        this.f51905c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f51903a) {
            case 0:
                org.telegram.messenger.g0.i3(new xl(this.f51904b, this.f51905c, 1), 400L);
                return;
            default:
                RectF rectF = this.f51905c;
                org.telegram.ui.Cells.q1 q1Var = this.f51904b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
