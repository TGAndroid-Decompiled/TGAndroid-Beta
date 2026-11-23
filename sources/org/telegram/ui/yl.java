package org.telegram.ui;

import android.graphics.RectF;
public final class yl implements Runnable {
    public final int f54226a;
    public final org.telegram.ui.Cells.r1 f54227b;
    public final RectF f54228c;

    public yl(org.telegram.ui.Cells.r1 r1Var, RectF rectF, int i7) {
        this.f54226a = i7;
        this.f54227b = r1Var;
        this.f54228c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f54226a) {
            case 0:
                org.telegram.messenger.g0.h3(new yl(this.f54227b, this.f54228c, 1), 400L);
                return;
            default:
                RectF rectF = this.f54228c;
                org.telegram.ui.Cells.r1 r1Var = this.f54227b;
                if (r1Var.getScrimBlockBounds() == rectF) {
                    r1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
