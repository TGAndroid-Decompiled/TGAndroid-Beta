package org.telegram.ui;

import android.content.Context;
public final class v6 extends org.telegram.ui.Components.mc {
    public final w6 f50638e0;

    public v6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.mc.W, 0, org.telegram.ui.Components.mc.f35920a0);
        this.f50638e0 = w6Var;
    }

    @Override
    public final void d(int i7, boolean z9) {
        y6 y6Var = (y6) this.f50638e0.f50923f;
        if (!z9) {
            y6Var.f51911b.l1();
            return;
        }
        int i10 = -1;
        if (i7 == 8) {
            i7 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < y6Var.f51919f0.size()) {
                u6 u6Var = (u6) y6Var.f51919f0.get(i11);
                if (u6Var != null && u6Var.f54543a == 11 && u6Var.f50415f == i7) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            y6Var.f51911b.e1(new l2.u(i10, 3), 0, true);
        } else {
            y6Var.f51911b.l1();
        }
    }
}
