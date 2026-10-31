package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;
public final class t71 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.k6 {
    public int e;
    public final x71 f41764f;

    public t71(x71 x71Var, Context context) {
        super(context);
        this.f41764f = x71Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false);
                if (x02 != this.e) {
                    this.e = x02;
                    h0Var.setOuterColor(x02);
                    h0Var.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
