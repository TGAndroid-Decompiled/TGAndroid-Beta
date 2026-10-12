package org.telegram.ui;

import android.content.Context;
public final class x6 extends org.telegram.ui.Components.fd {
    public final z6 f43775e0;

    public x6(z6 z6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.fd.W, 0, org.telegram.ui.Components.fd.f26012a0);
        this.f43775e0 = z6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        b7 b7Var = this.f43775e0.f44626e;
        if (!z10) {
            b7Var.f36081b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < b7Var.f36080a0.size()) {
                w6 w6Var = (w6) b7Var.f36080a0.get(i12);
                if (w6Var != null && w6Var.f16877a == 11 && w6Var.f43049f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            b7Var.f36081b.e1(new i2.w(i11, 7), 0, true);
        } else {
            b7Var.f36081b.j1();
        }
    }
}
