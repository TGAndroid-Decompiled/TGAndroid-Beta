package org.telegram.ui;

import android.content.Context;
public final class u91 extends org.telegram.ui.Components.zl0 {
    public int f41134e3;
    public final va1 f41135f3;

    public u91(va1 va1Var, Context context) {
        super(context, null);
        this.f41135f3 = va1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        aa1 aa1Var;
        super.onMeasure(i10, i11);
        if (this.f41134e3 != getMeasuredHeight() && (aa1Var = this.f41135f3.W) != null) {
            aa1Var.l();
        }
        this.f41134e3 = getMeasuredHeight();
    }
}
