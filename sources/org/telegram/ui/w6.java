package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class w6 extends s7 {

    public final int f43621w;

    public final Object f43622x;

    public w6(Object obj, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        super(context, n2Var);
        this.f43621w = i10;
        this.f43622x = obj;
    }

    public void e(boolean z10) {
        z6 z6Var = ((x6) this.f43622x).f44289e;
        if (!z10) {
            ((org.telegram.ui.ActionBar.n2) z6Var).actionBar.s();
        } else {
            z6.b0(z6Var, true);
            ((org.telegram.ui.ActionBar.n2) z6Var).actionBar.O(null, null);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f43621w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.rl.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((av) this.f43622x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                break;
        }
    }
}
