package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x6 extends u7 {
    public final int F = 1;
    public final Object G;

    public x6(lv lvVar, Context context, a7 a7Var) {
        super(context, a7Var, null);
        this.G = lvVar;
    }

    public void f(boolean z10) {
        a7 a7Var = ((y6) this.G).e;
        if (z10) {
            le.b bVar = a7Var.Q;
            if (bVar != null) {
                bVar.a(true, true);
            }
            a7.c0(a7Var).O(null, null);
            return;
        }
        a7.d0(a7Var).r();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.F) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((lv) this.G).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public x6(y6 y6Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, ki.i iVar) {
        super(context, o2Var, iVar);
        this.G = y6Var;
    }
}
