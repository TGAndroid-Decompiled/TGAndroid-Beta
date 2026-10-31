package org.telegram.ui;

import java.util.ArrayList;
public final class u11 extends g.o {
    public final int f41990c;
    public final i31 d;

    public u11(i31 i31Var, int i10) {
        this.f41990c = i10;
        this.d = i31Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f41990c) {
            case 0:
                i31 i31Var = this.d;
                if (i31Var.f38161w0.indexOfKey(i10) < 0 && i31Var.f38169z0.indexOfKey(i10) < 0 && i10 != i31Var.f38124f && i10 != i31Var.D && i10 != i31Var.f38139n && i10 != i31Var.h && i10 != i31Var.f38160w && i10 != i31Var.f38111a && i10 != i31Var.f38166y) {
                    if ((i10 >= i31Var.E && i10 < i31Var.F) || i31Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return i31Var.f38149r0.J;
            default:
                i31 i31Var2 = this.d;
                t21 t21Var = i31Var2.f38146q0;
                int d = t21Var.d(i10);
                if (d == 6) {
                    return i31Var2.f38149r0.J;
                }
                if (d != 5) {
                    i31 i31Var3 = t21Var.f41700s;
                    if (i31Var3.W != 14 ? i10 <= (i11 = t21Var.f41696c) || (i10 - i11) - 1 >= i31Var3.D1.size() : (arrayList = i31Var3.C1) == null || i10 < (i12 = t21Var.f41696c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
