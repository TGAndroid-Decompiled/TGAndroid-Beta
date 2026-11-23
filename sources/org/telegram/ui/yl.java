package org.telegram.ui;

import android.graphics.RectF;
public final class yl implements Runnable {
    public final int f54200a;
    public final org.telegram.ui.Cells.r1 f54201b;
    public final RectF f54202c;

    public yl(org.telegram.ui.Cells.r1 r1Var, RectF rectF, int i7) {
        this.f54200a = i7;
        this.f54201b = r1Var;
        this.f54202c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f54200a) {
            case 0:
                org.telegram.messenger.g0.h3(new yl(this.f54201b, this.f54202c, 1), 400L);
                return;
            default:
                RectF rectF = this.f54202c;
                org.telegram.ui.Cells.r1 r1Var = this.f54201b;
                if (r1Var.getScrimBlockBounds() == rectF) {
                    r1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
