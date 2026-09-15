package org.telegram.ui;

import android.content.Context;
public final class z91 extends org.telegram.ui.Components.ll0 {
    public int X2;
    public final ya1 Y2;

    public z91(ya1 ya1Var, Context context) {
        super(context, null);
        this.Y2 = ya1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        da1 da1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (da1Var = this.Y2.X) != null) {
            da1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
