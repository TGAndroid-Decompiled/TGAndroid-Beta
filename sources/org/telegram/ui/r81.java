package org.telegram.ui;

import android.content.Context;

public final class r81 extends org.telegram.ui.Components.zk0 {
    public int T2;
    public final q91 U2;

    public r81(q91 q91Var, Context context) {
        super(context, null);
        this.U2 = q91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        v81 v81Var;
        super.onMeasure(i10, i11);
        if (this.T2 != getMeasuredHeight() && (v81Var = this.U2.T) != null) {
            v81Var.l();
        }
        this.T2 = getMeasuredHeight();
    }
}
