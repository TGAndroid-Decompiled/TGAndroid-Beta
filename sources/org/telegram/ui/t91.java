package org.telegram.ui;

import android.content.Context;
public final class t91 extends org.telegram.ui.Components.zl0 {
    public int f38137e3;
    public final sa1 f38138f3;

    public t91(sa1 sa1Var, Context context) {
        super(context, null);
        this.f38138f3 = sa1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        x91 x91Var;
        super.onMeasure(i10, i11);
        if (this.f38137e3 != getMeasuredHeight() && (x91Var = this.f38138f3.X) != null) {
            x91Var.l();
        }
        this.f38137e3 = getMeasuredHeight();
    }
}
