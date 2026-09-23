package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w6 extends s7 {
    public final int f38547w;
    public final Object f38548x;

    public w6(Object obj, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        super(context, n2Var);
        this.f38547w = i10;
        this.f38548x = obj;
    }

    public void e(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        z6 z6Var = ((x6) this.f38548x).e;
        if (!z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
            kVar.r();
            return;
        }
        z6.b0(z6Var, true);
        kVar2 = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
        kVar2.O(null, null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f38547w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.ul.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((gv) this.f38548x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
