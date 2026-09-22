package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w6 extends s7 {
    public final int f38699w;
    public final Object f38700x;

    public w6(Object obj, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        super(context, n2Var);
        this.f38699w = i10;
        this.f38700x = obj;
    }

    public void e(boolean z10) {
        z6 z6Var = ((x6) this.f38700x).e;
        if (z10) {
            z6.b0(z6Var, true);
            z6.d0(z6Var).O(null, null);
            return;
        }
        z6.e0(z6Var).r();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f38699w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.vl.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((jv) this.f38700x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
