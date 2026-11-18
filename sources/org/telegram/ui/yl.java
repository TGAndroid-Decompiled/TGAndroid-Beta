package org.telegram.ui;

import android.graphics.RectF;
public final class yl implements Runnable {
    public final int f54180a;
    public final org.telegram.ui.Cells.r1 f54181b;
    public final RectF f54182c;

    public yl(org.telegram.ui.Cells.r1 r1Var, RectF rectF, int i7) {
        this.f54180a = i7;
        this.f54181b = r1Var;
        this.f54182c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f54180a) {
            case 0:
                org.telegram.messenger.g0.h3(new yl(this.f54181b, this.f54182c, 1), 400L);
                return;
            default:
                RectF rectF = this.f54182c;
                org.telegram.ui.Cells.r1 r1Var = this.f54181b;
                if (r1Var.getScrimBlockBounds() == rectF) {
                    r1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
