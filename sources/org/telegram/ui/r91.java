package org.telegram.ui;

import android.content.Context;
public final class r91 extends org.telegram.ui.Components.yl0 {
    public int X2;
    public final ra1 Y2;

    public r91(ra1 ra1Var, Context context) {
        super(context, null);
        this.Y2 = ra1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        w91 w91Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (w91Var = this.Y2.W) != null) {
            w91Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
