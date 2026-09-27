package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y6 extends v7 {
    public final int F = 1;
    public final Object G;

    public y6(hv hvVar, Context context, b7 b7Var) {
        super(context, b7Var, null);
        this.G = hvVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        b7 b7Var = ((z6) this.G).e;
        if (!z10) {
            lVar = ((org.telegram.ui.ActionBar.o2) b7Var).actionBar;
            lVar.s();
            return;
        }
        le.c cVar = b7Var.Q;
        if (cVar != null) {
            cVar.a(true, true);
        }
        lVar2 = ((org.telegram.ui.ActionBar.o2) b7Var).actionBar;
        lVar2.P(null, null);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.F) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((hv) this.G).h - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public y6(z6 z6Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, li.l lVar) {
        super(context, o2Var, lVar);
        this.G = z6Var;
    }
}
