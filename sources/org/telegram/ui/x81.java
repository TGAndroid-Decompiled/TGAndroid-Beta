package org.telegram.ui;

import android.content.Context;
public final class x81 extends org.telegram.ui.Components.nm0 {
    public int f45628f3;
    public final y91 f45629g3;

    public x81(y91 y91Var, Context context) {
        super(context, null);
        this.f45629g3 = y91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d91 d91Var;
        super.onMeasure(i10, i11);
        if (this.f45628f3 != getMeasuredHeight() && (d91Var = this.f45629g3.W) != null) {
            d91Var.l();
        }
        this.f45628f3 = getMeasuredHeight();
    }
}
