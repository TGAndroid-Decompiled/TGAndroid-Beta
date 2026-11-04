package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;
public final class r51 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.z5 {
    public int f49106e;
    public final v51 f49107f;

    public r51(v51 v51Var, Context context) {
        super(context);
        this.f49107f = v51Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                if (x02 != this.f49106e) {
                    this.f49106e = x02;
                    h0Var.setOuterColor(x02);
                    h0Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
