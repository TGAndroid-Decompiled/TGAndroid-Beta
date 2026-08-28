package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v6 extends r7 {
    public final int f43393w;
    public final Object f43394x;

    public v6(Object obj, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        super(context, o2Var);
        this.f43393w = i9;
        this.f43394x = obj;
    }

    public void e(boolean z10) {
        y6 y6Var = ((w6) this.f43394x).f43679e;
        if (z10) {
            y6.a0(y6Var, true);
            ((org.telegram.ui.ActionBar.o2) y6Var).actionBar.N(null, null);
            return;
        }
        ((org.telegram.ui.ActionBar.o2) y6Var).actionBar.r();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        switch (this.f43393w) {
            case 0:
                super.onMeasure(i9, org.telegram.messenger.ll.d(12.0f, View.MeasureSpec.getSize(i10) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((((xu) this.f43394x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
