package org.telegram.ui;

import android.content.Context;
public final class v6 extends org.telegram.ui.Components.ic {
    public final w6 f52138f0;

    public v6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.ic.f35567a0, 0, org.telegram.ui.Components.ic.f35568b0);
        this.f52138f0 = w6Var;
    }

    @Override
    public final void d(int i7, boolean z10) {
        y6 y6Var = (y6) this.f52138f0.f52444f;
        if (!z10) {
            y6Var.f53440b.l1();
            return;
        }
        int i10 = -1;
        if (i7 == 8) {
            i7 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < y6Var.f53449g0.size()) {
                u6 u6Var = (u6) y6Var.f53449g0.get(i11);
                if (u6Var != null && u6Var.f56015a == 11 && u6Var.f51775f == i7) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            y6Var.f53440b.e1(new l2.t(i10, 3), 0, true);
        } else {
            y6Var.f53440b.l1();
        }
    }
}
