package org.telegram.ui;

import android.content.Context;
public final class u6 extends org.telegram.ui.Components.rc {
    public final v6 f52459f0;

    public u6(v6 v6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.rc.f39143a0, 0, org.telegram.ui.Components.rc.f39144b0);
        this.f52459f0 = v6Var;
    }

    @Override
    public final void d(int i7, boolean z10) {
        x6 x6Var = (x6) this.f52459f0.f52737f;
        if (!z10) {
            x6Var.f53650b.l1();
            return;
        }
        int i10 = -1;
        if (i7 == 8) {
            i7 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < x6Var.f53659g0.size()) {
                t6 t6Var = (t6) x6Var.f53659g0.get(i11);
                if (t6Var != null && t6Var.f56634a == 11 && t6Var.f52238f == i7) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            x6Var.f53650b.e1(new l2.t(i10, 3), 0, true);
        } else {
            x6Var.f53650b.l1();
        }
    }
}
