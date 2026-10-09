package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v6 extends r7 {
    public final int f42659w;
    public final Object f42660x;

    public v6(Object obj, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        super(context, n2Var);
        this.f42659w = i10;
        this.f42660x = obj;
    }

    public void e(boolean z10) {
        y6 y6Var = ((w6) this.f42660x).f43094e;
        if (z10) {
            y6.b0(y6Var, true);
            y6.d0(y6Var).O(null, null);
            return;
        }
        y6.e0(y6Var).s();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f42659w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.bi.c(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((iv) this.f42660x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
