package org.telegram.ui;

import android.content.Context;
public final class s51 extends org.telegram.ui.Components.uk0 {
    public int f41229e3;
    public final s61 f41230f3;

    public s51(s61 s61Var, Context context) {
        super(context, null);
        this.f41230f3 = s61Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        x51 x51Var;
        super.onMeasure(i10, i11);
        if (this.f41229e3 != getMeasuredHeight() && (x51Var = this.f41230f3.W) != null) {
            x51Var.f();
        }
        this.f41229e3 = getMeasuredHeight();
    }
}
