package org.telegram.ui;

import android.graphics.RectF;
public final class yl implements Runnable {
    public final int f54395a;
    public final org.telegram.ui.Cells.r1 f54396b;
    public final RectF f54397c;

    public yl(org.telegram.ui.Cells.r1 r1Var, RectF rectF, int i7) {
        this.f54395a = i7;
        this.f54396b = r1Var;
        this.f54397c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f54395a) {
            case 0:
                org.telegram.messenger.g0.h3(new yl(this.f54396b, this.f54397c, 1), 400L);
                return;
            default:
                RectF rectF = this.f54397c;
                org.telegram.ui.Cells.r1 r1Var = this.f54396b;
                if (r1Var.getScrimBlockBounds() == rectF) {
                    r1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
