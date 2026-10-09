package org.telegram.ui;

import java.util.ArrayList;
public final class v51 extends g.o {
    public final int f42658c;
    public final k71 d;

    public v51(k71 k71Var, int i10) {
        this.f42658c = i10;
        this.d = k71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f42658c) {
            case 0:
                k71 k71Var = this.d;
                if (k71Var.f39164w0.indexOfKey(i10) < 0 && k71Var.f39172z0.indexOfKey(i10) < 0 && i10 != k71Var.f39127f && i10 != k71Var.f39169y && i10 != k71Var.f39142n && i10 != k71Var.h && i10 != k71Var.v && i10 != k71Var.f39113a && i10 != k71Var.f39166x) {
                    if ((i10 >= k71Var.E && i10 < k71Var.F) || k71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return k71Var.f39152r0.J;
            default:
                k71 k71Var2 = this.d;
                u61 u61Var = k71Var2.f39149q0;
                int j3 = u61Var.j(i10);
                if (j3 == 6) {
                    return k71Var2.f39152r0.J;
                }
                if (j3 != 5) {
                    k71 k71Var3 = u61Var.f42348s;
                    if (k71Var3.W != 14 ? i10 <= (i11 = u61Var.f42343c) || (i10 - i11) - 1 >= k71Var3.C1.size() : (arrayList = k71Var3.B1) == null || i10 < (i12 = u61Var.f42343c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
