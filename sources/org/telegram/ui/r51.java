package org.telegram.ui;

import java.util.ArrayList;
public final class r51 extends g.p {
    public final int f37029c;
    public final g71 d;

    public r51(g71 g71Var, int i10) {
        this.f37029c = i10;
        this.d = g71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f37029c) {
            case 0:
                g71 g71Var = this.d;
                if (g71Var.f33828w0.indexOfKey(i10) < 0 && g71Var.f33836z0.indexOfKey(i10) < 0 && i10 != g71Var.f33791f && i10 != g71Var.f33833y && i10 != g71Var.f33806n && i10 != g71Var.h && i10 != g71Var.v && i10 != g71Var.f33778a && i10 != g71Var.f33830x) {
                    if ((i10 >= g71Var.E && i10 < g71Var.F) || g71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return g71Var.f33816r0.J;
            default:
                g71 g71Var2 = this.d;
                q61 q61Var = g71Var2.f33813q0;
                int j3 = q61Var.j(i10);
                if (j3 == 6) {
                    return g71Var2.f33816r0.J;
                }
                if (j3 != 5) {
                    g71 g71Var3 = q61Var.f36782s;
                    if (g71Var3.W != 14 ? i10 <= (i11 = q61Var.f36778c) || (i10 - i11) - 1 >= g71Var3.C1.size() : (arrayList = g71Var3.B1) == null || i10 < (i12 = q61Var.f36778c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
