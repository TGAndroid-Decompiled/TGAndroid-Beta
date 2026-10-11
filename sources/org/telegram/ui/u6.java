package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u6 extends q7 {
    public final int f42400w;
    public final Object f42401x;

    public u6(Object obj, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        super(context, m2Var);
        this.f42400w = i10;
        this.f42401x = obj;
    }

    public void e(boolean z10) {
        x6 x6Var = ((v6) this.f42401x).f42913e;
        if (z10) {
            x6.b0(x6Var, true);
            x6.d0(x6Var).O(null, null);
            return;
        }
        x6.e0(x6Var).s();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f42400w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.ai.c(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((hv) this.f42401x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
