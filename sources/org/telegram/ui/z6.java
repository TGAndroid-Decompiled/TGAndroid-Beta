package org.telegram.ui;

import android.content.Context;
public final class z6 extends org.telegram.ui.Components.fd {
    public final b7 f42170e0;

    public z6(b7 b7Var, Context context) {
        super(context, 11, org.telegram.ui.Components.fd.W, 0, org.telegram.ui.Components.fd.f24695a0);
        this.f42170e0 = b7Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        d7 d7Var = this.f42170e0.e;
        if (!z10) {
            d7Var.f34892b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < d7Var.f34891a0.size()) {
                y6 y6Var = (y6) d7Var.f34891a0.get(i12);
                if (y6Var != null && y6Var.f42904a == 11 && y6Var.f41749f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            d7Var.f34892b.e1(new i2.v(i11, 7), 0, true);
        } else {
            d7Var.f34892b.j1();
        }
    }
}
