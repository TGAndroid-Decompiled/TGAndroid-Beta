package org.telegram.ui;

import android.content.Context;
public final class v81 extends org.telegram.ui.Components.mm0 {
    public int f44738f3;
    public final w91 f44739g3;

    public v81(w91 w91Var, Context context) {
        super(context, null);
        this.f44739g3 = w91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        b91 b91Var;
        super.onMeasure(i10, i11);
        if (this.f44738f3 != getMeasuredHeight() && (b91Var = this.f44739g3.W) != null) {
            b91Var.l();
        }
        this.f44738f3 = getMeasuredHeight();
    }
}
