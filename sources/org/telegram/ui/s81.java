package org.telegram.ui;

import android.content.Context;
public final class s81 extends org.telegram.ui.Components.im0 {
    public int V2;
    public final r91 W2;

    public s81(r91 r91Var, Context context) {
        super(context, null);
        this.W2 = r91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        w81 w81Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (w81Var = this.W2.X) != null) {
            w81Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
