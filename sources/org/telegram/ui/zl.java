package org.telegram.ui;

import android.graphics.RectF;
public final class zl implements Runnable {
    public final int f52591a;
    public final org.telegram.ui.Cells.q1 f52592b;
    public final RectF f52593c;

    public zl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i7) {
        this.f52591a = i7;
        this.f52592b = q1Var;
        this.f52593c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f52591a) {
            case 0:
                org.telegram.messenger.g0.i3(new zl(this.f52592b, this.f52593c, 1), 400L);
                return;
            default:
                RectF rectF = this.f52593c;
                org.telegram.ui.Cells.q1 q1Var = this.f52592b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
