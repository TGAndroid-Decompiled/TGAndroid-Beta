package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v6 extends r7 {
    public final int f37418w;
    public final Object f37419x;

    public v6(Object obj, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        super(context, p2Var);
        this.f37418w = i10;
        this.f37419x = obj;
    }

    public void e(boolean z10) {
        y6 y6Var = ((w6) this.f37419x).e;
        if (z10) {
            y6.b0(y6Var, true);
            y6.d0(y6Var).O(null, null);
            return;
        }
        y6.e0(y6Var).r();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f37418w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.em.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((lv) this.f37419x).h - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
