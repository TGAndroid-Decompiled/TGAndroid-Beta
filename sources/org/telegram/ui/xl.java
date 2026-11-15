package org.telegram.ui;

import android.graphics.RectF;
public final class xl implements Runnable {
    public final int f53261a;
    public final org.telegram.ui.Cells.q1 f53262b;
    public final RectF f53263c;

    public xl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f53261a = i7;
        this.f53262b = q1Var;
        this.f53263c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f53261a) {
            case 0:
                org.telegram.messenger.g0.i3(new xl(this.f53262b, this.f53263c, 1), 400L);
                return;
            default:
                RectF rectF = this.f53263c;
                org.telegram.ui.Cells.q1 q1Var = this.f53262b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
