package org.telegram.ui;

import android.content.Context;
public final class x6 extends org.telegram.ui.Components.wc {
    public final z6 f42936b0;

    public x6(z6 z6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.wc.T, 0, org.telegram.ui.Components.wc.U);
        this.f42936b0 = z6Var;
    }

    @Override
    public final void d(int i10, boolean z4) {
        b7 b7Var = this.f42936b0.f43810e;
        if (!z4) {
            b7Var.f35376b.i1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < b7Var.X.size()) {
                w6 w6Var = (w6) b7Var.X.get(i12);
                if (w6Var != null && w6Var.f2505a == 11 && w6Var.f42295f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            b7Var.f35376b.d1(new d4.b(i11, 3), 0, true);
        } else {
            b7Var.f35376b.i1();
        }
    }
}
