package org.telegram.ui;

import android.content.Context;
public final class v81 extends org.telegram.ui.Components.mm0 {
    public int f44741f3;
    public final w91 f44742g3;

    public v81(w91 w91Var, Context context) {
        super(context, null);
        this.f44742g3 = w91Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        b91 b91Var;
        super.onMeasure(i10, i11);
        if (this.f44741f3 != getMeasuredHeight() && (b91Var = this.f44742g3.W) != null) {
            b91Var.l();
        }
        this.f44741f3 = getMeasuredHeight();
    }
}
