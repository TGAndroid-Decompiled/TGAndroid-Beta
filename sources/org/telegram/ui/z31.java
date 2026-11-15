package org.telegram.ui;

import android.content.Context;
public final class z31 extends org.telegram.ui.Components.uj0 {
    public int f53836f3;
    public final z41 f53837g3;

    public z31(z41 z41Var, Context context) {
        super(context, null);
        this.f53837g3 = z41Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        e41 e41Var;
        super.onMeasure(i7, i10);
        if (this.f53836f3 != getMeasuredHeight() && (e41Var = this.f53837g3.X) != null) {
            e41Var.f();
        }
        this.f53836f3 = getMeasuredHeight();
    }
}
