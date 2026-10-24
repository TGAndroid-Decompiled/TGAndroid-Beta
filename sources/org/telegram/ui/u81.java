package org.telegram.ui;

import android.content.Context;
public final class u81 extends org.telegram.ui.Components.lm0 {
    public int Y2;
    public final t91 Z2;

    public u81(t91 t91Var, Context context) {
        super(context, null);
        this.Z2 = t91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        y81 y81Var;
        super.onMeasure(i10, i11);
        if (this.Y2 != getMeasuredHeight() && (y81Var = this.Z2.X) != null) {
            y81Var.l();
        }
        this.Y2 = getMeasuredHeight();
    }
}
