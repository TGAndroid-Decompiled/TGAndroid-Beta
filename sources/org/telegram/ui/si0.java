package org.telegram.ui;

import android.content.Context;
public final class si0 extends org.telegram.ui.Cells.t1 {
    public int Ce;
    public int De;
    public int Ee;
    public final ti0 Fe;

    public si0(ti0 ti0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, true, null, g6Var);
        this.Fe = ti0Var;
        this.Ce = Integer.MAX_VALUE;
        this.De = Integer.MAX_VALUE;
        this.Ee = -1;
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int id2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.Wc.f23708w0 && i11 != 0 && this.Ce != Integer.MAX_VALUE && i13 != 0 && this.De != Integer.MAX_VALUE) {
            int i14 = this.Ee;
            int i15 = 0;
            if (getMessageObject() == null) {
                id2 = 0;
            } else {
                id2 = getMessageObject().getId();
            }
            if (i14 == id2) {
                if (!this.Fe.f41573t0) {
                    setTranslationY(-(i11 - this.Ce));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                }
                this.Ce = getTop();
                this.De = getBottom();
                if (getMessageObject() != null) {
                    i15 = getMessageObject().getId();
                }
                this.Ee = i15;
            }
        }
    }

    @Override
    public final jh.j w3() {
        return jh.j.d(1, this, this.Fe.C);
    }
}
