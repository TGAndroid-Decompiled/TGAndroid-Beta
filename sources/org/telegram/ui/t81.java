package org.telegram.ui;

import android.content.Context;
public final class t81 extends org.telegram.ui.Components.wk0 {
    public int T2;
    public final s91 U2;

    public t81(s91 s91Var, Context context) {
        super(context, null);
        this.U2 = s91Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        x81 x81Var;
        super.onMeasure(i9, i10);
        if (this.T2 != getMeasuredHeight() && (x81Var = this.U2.T) != null) {
            x81Var.l();
        }
        this.T2 = getMeasuredHeight();
    }
}
