package org.telegram.ui;

import android.content.Context;
public final class u91 extends org.telegram.ui.Components.zl0 {
    public int f41127e3;
    public final va1 f41128f3;

    public u91(va1 va1Var, Context context) {
        super(context, null);
        this.f41128f3 = va1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        aa1 aa1Var;
        super.onMeasure(i10, i11);
        if (this.f41127e3 != getMeasuredHeight() && (aa1Var = this.f41128f3.W) != null) {
            aa1Var.l();
        }
        this.f41127e3 = getMeasuredHeight();
    }
}
