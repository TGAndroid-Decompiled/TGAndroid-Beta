package org.telegram.ui;

import android.content.Context;
public final class uf0 extends org.telegram.ui.Cells.q1 {
    public int f50076kd;
    public int f50077ld;
    public int f50078md;
    public final vf0 f50079nd;

    public uf0(vf0 vf0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, true, null, e6Var);
        this.f50079nd = vf0Var;
        this.f50076kd = Integer.MAX_VALUE;
        this.f50077ld = Integer.MAX_VALUE;
        this.f50078md = -1;
    }

    @Override
    public final yh.e U2() {
        return yh.e.d(1, this, this.f50079nd.F);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int f12;
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.hb.f30936x0 && i10 != 0 && this.f50076kd != Integer.MAX_VALUE && i12 != 0 && this.f50077ld != Integer.MAX_VALUE) {
            int i13 = this.f50078md;
            int i14 = 0;
            if (getMessageObject() == null) {
                f12 = 0;
            } else {
                f12 = getMessageObject().f1();
            }
            if (i13 == f12) {
                if (!this.f50079nd.f50502w0) {
                    setTranslationY(-(i10 - this.f50076kd));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                }
                this.f50076kd = getTop();
                this.f50077ld = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().f1();
                }
                this.f50078md = i14;
            }
        }
    }
}
