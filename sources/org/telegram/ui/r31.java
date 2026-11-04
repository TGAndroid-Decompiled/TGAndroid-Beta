package org.telegram.ui;

import android.content.Context;
public final class r31 extends org.telegram.ui.Components.tj0 {
    public int f49022f3;
    public final r41 f49023g3;

    public r31(r41 r41Var, Context context) {
        super(context, null);
        this.f49023g3 = r41Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        w31 w31Var;
        super.onMeasure(i3, i10);
        if (this.f49022f3 != getMeasuredHeight() && (w31Var = this.f49023g3.X) != null) {
            w31Var.f();
        }
        this.f49022f3 = getMeasuredHeight();
    }
}
