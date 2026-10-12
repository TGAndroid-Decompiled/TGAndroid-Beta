package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y6 extends u7 {
    public final int f44308w;
    public final Object f44309x;

    public y6(Object obj, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        super(context, m2Var);
        this.f44308w = i10;
        this.f44309x = obj;
    }

    public void e(boolean z10) {
        b7 b7Var = ((z6) this.f44309x).f44621e;
        if (z10) {
            b7.b0(b7Var, true);
            b7.d0(b7Var).P(null, null);
            return;
        }
        b7.e0(b7Var).t();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f44308w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.am.c(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((lv) this.f44309x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
