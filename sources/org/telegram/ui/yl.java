package org.telegram.ui;

import android.graphics.RectF;
public final class yl implements Runnable {
    public final int f54221a;
    public final org.telegram.ui.Cells.q1 f54222b;
    public final RectF f54223c;

    public yl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f54221a = i7;
        this.f54222b = q1Var;
        this.f54223c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f54221a) {
            case 0:
                org.telegram.messenger.g0.h3(new yl(this.f54222b, this.f54223c, 1), 400L);
                return;
            default:
                RectF rectF = this.f54223c;
                org.telegram.ui.Cells.q1 q1Var = this.f54222b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
