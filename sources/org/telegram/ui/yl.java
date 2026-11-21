package org.telegram.ui;

import android.graphics.RectF;
public final class yl implements Runnable {
    public final int f54222a;
    public final org.telegram.ui.Cells.r1 f54223b;
    public final RectF f54224c;

    public yl(org.telegram.ui.Cells.r1 r1Var, RectF rectF, int i7) {
        this.f54222a = i7;
        this.f54223b = r1Var;
        this.f54224c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f54222a) {
            case 0:
                org.telegram.messenger.g0.h3(new yl(this.f54223b, this.f54224c, 1), 400L);
                return;
            default:
                RectF rectF = this.f54224c;
                org.telegram.ui.Cells.r1 r1Var = this.f54223b;
                if (r1Var.getScrimBlockBounds() == rectF) {
                    r1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
