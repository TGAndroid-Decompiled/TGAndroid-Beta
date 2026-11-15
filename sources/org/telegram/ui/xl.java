package org.telegram.ui;

import android.graphics.RectF;
public final class xl implements Runnable {
    public final int f53260a;
    public final org.telegram.ui.Cells.q1 f53261b;
    public final RectF f53262c;

    public xl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f53260a = i7;
        this.f53261b = q1Var;
        this.f53262c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f53260a) {
            case 0:
                org.telegram.messenger.g0.i3(new xl(this.f53261b, this.f53262c, 1), 400L);
                return;
            default:
                RectF rectF = this.f53262c;
                org.telegram.ui.Cells.q1 q1Var = this.f53261b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
