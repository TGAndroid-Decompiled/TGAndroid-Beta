package org.telegram.ui;

import android.content.Context;
public final class u51 extends org.telegram.ui.Components.tk0 {
    public int f42013e3;
    public final u61 f42014f3;

    public u51(u61 u61Var, Context context) {
        super(context, null);
        this.f42014f3 = u61Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        z51 z51Var;
        super.onMeasure(i10, i11);
        if (this.f42013e3 != getMeasuredHeight() && (z51Var = this.f42014f3.W) != null) {
            z51Var.f();
        }
        this.f42013e3 = getMeasuredHeight();
    }
}
