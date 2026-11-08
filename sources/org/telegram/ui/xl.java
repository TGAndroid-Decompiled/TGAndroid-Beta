package org.telegram.ui;

import android.graphics.RectF;
public final class xl implements Runnable {
    public final int f51896a;
    public final org.telegram.ui.Cells.q1 f51897b;
    public final RectF f51898c;

    public xl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f51896a = i7;
        this.f51897b = q1Var;
        this.f51898c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f51896a) {
            case 0:
                org.telegram.messenger.g0.i3(new xl(this.f51897b, this.f51898c, 1), 400L);
                return;
            default:
                RectF rectF = this.f51898c;
                org.telegram.ui.Cells.q1 q1Var = this.f51897b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
