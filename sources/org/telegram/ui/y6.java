package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y6 extends u7 {
    public final int f43566w;
    public final Object f43567x;

    public y6(Object obj, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        super(context, p2Var);
        this.f43566w = i10;
        this.f43567x = obj;
    }

    public void e(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        b7 b7Var = ((z6) this.f43567x).f43823e;
        if (!z4) {
            kVar = ((org.telegram.ui.ActionBar.p2) b7Var).actionBar;
            kVar.r();
            return;
        }
        b7.b0(b7Var, true);
        kVar2 = ((org.telegram.ui.ActionBar.p2) b7Var).actionBar;
        kVar2.O(null, null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f43566w) {
            case 0:
                super.onMeasure(i10, b.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((hv) this.f43567x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
