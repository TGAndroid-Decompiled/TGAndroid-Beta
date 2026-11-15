package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;
public final class y51 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.z5 {
    public int f53428e;
    public final c61 f53429f;

    public y51(c61 c61Var, Context context) {
        super(context);
        this.f53429f = c61Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
                if (x02 != this.f53428e) {
                    this.f53428e = x02;
                    h0Var.setOuterColor(x02);
                    h0Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
