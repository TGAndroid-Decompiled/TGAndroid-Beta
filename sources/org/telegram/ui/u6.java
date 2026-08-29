package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u6 extends q7 {
    public final int f43187w;
    public final Object f43188x;

    public u6(Object obj, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        super(context, o2Var);
        this.f43187w = i10;
        this.f43188x = obj;
    }

    public void e(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        x6 x6Var = ((v6) this.f43188x).f43438e;
        if (!z10) {
            lVar = ((org.telegram.ui.ActionBar.o2) x6Var).actionBar;
            lVar.r();
            return;
        }
        x6.b0(x6Var, true);
        lVar2 = ((org.telegram.ui.ActionBar.o2) x6Var).actionBar;
        lVar2.O(null, null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f43187w) {
            case 0:
                super.onMeasure(i10, b.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((yu) this.f43188x).h - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
