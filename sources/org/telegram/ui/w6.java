package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w6 extends t7 {
    public final int F = 1;
    public final Object G;

    public w6(kv kvVar, Context context, z6 z6Var) {
        super(context, z6Var, null);
        this.G = kvVar;
    }

    public void f(boolean z10) {
        z6 z6Var = ((x6) this.G).e;
        if (z10) {
            le.b bVar = z6Var.Q;
            if (bVar != null) {
                bVar.a(true, true);
            }
            z6.c0(z6Var).O(null, null);
            return;
        }
        z6.d0(z6Var).r();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.F) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((kv) this.G).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public w6(x6 x6Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, li.i iVar) {
        super(context, n2Var, iVar);
        this.G = x6Var;
    }
}
