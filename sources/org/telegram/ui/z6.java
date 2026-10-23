package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z6 extends v7 {
    public final int f44058x;
    public final Object f44059y;

    public z6(Object obj, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        super(context, o2Var);
        this.f44058x = i10;
        this.f44059y = obj;
    }

    public void e(boolean z10) {
        c7 c7Var = ((a7) this.f44059y).e;
        if (z10) {
            c7.b0(c7Var, true);
            c7.d0(c7Var).N(null, null);
            return;
        }
        c7.e0(c7Var).r();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f44058x) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.sl.c(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((yu) this.f44059y).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
