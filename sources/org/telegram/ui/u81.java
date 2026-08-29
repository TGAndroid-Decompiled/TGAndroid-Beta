package org.telegram.ui;

import android.content.Context;
public final class u81 extends org.telegram.ui.Components.jl0 {
    public int T2;
    public final t91 U2;

    public u81(t91 t91Var, Context context) {
        super(context, null);
        this.U2 = t91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        y81 y81Var;
        super.onMeasure(i10, i11);
        if (this.T2 != getMeasuredHeight() && (y81Var = this.U2.T) != null) {
            y81Var.l();
        }
        this.T2 = getMeasuredHeight();
    }
}
