package org.telegram.ui;

import android.graphics.RectF;
public final class tl implements Runnable {
    public final int f49824a;
    public final org.telegram.ui.Cells.q1 f49825b;
    public final RectF f49826c;

    public tl(org.telegram.ui.Cells.q1 q1Var, RectF rectF, int i3) {
        this.f49824a = i3;
        this.f49825b = q1Var;
        this.f49826c = rectF;
    }

    @Override
    public final void run() {
        switch (this.f49824a) {
            case 0:
                org.telegram.messenger.g0.i3(new tl(this.f49825b, this.f49826c, 1), 400L);
                return;
            default:
                RectF rectF = this.f49826c;
                org.telegram.ui.Cells.q1 q1Var = this.f49825b;
                if (q1Var.getScrimBlockBounds() == rectF) {
                    q1Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
