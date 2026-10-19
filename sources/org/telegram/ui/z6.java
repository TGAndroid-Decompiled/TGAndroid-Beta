package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z6 extends v7 {
    public final int f43638w;
    public final Object f43639x;

    public z6(Object obj, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        super(context, n2Var);
        this.f43638w = i10;
        this.f43639x = obj;
    }

    public void e(boolean z10) {
        c7 c7Var = ((a7) this.f43639x).e;
        if (z10) {
            c7.b0(c7Var, true);
            c7.d0(c7Var).O(null, null);
            return;
        }
        c7.e0(c7Var).s();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f43638w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.kk.c(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((vu) this.f43639x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
