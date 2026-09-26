package org.telegram.ui;

import android.content.Context;
public final class t91 extends org.telegram.ui.Components.xl0 {
    public int X2;
    public final sa1 Y2;

    public t91(sa1 sa1Var, Context context) {
        super(context, null);
        this.Y2 = sa1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        x91 x91Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (x91Var = this.Y2.X) != null) {
            x91Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
