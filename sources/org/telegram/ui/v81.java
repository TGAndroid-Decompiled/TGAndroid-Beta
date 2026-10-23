package org.telegram.ui;

import android.content.Context;
public final class v81 extends org.telegram.ui.Components.mm0 {
    public int Y2;
    public final u91 Z2;

    public v81(u91 u91Var, Context context) {
        super(context, null);
        this.Z2 = u91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        z81 z81Var;
        super.onMeasure(i10, i11);
        if (this.Y2 != getMeasuredHeight() && (z81Var = this.Z2.X) != null) {
            z81Var.l();
        }
        this.Y2 = getMeasuredHeight();
    }
}
