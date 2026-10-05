package org.telegram.ui;

import android.content.Context;
public final class s91 extends org.telegram.ui.Components.zl0 {
    public int f40409e3;
    public final ta1 f40410f3;

    public s91(ta1 ta1Var, Context context) {
        super(context, null);
        this.f40410f3 = ta1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        y91 y91Var;
        super.onMeasure(i10, i11);
        if (this.f40409e3 != getMeasuredHeight() && (y91Var = this.f40410f3.W) != null) {
            y91Var.l();
        }
        this.f40409e3 = getMeasuredHeight();
    }
}
