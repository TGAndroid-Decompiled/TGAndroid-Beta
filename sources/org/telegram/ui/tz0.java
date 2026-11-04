package org.telegram.ui;

import java.util.ArrayList;
public final class tz0 extends g.p {
    public final int f49927c;
    public final g11 d;

    public tz0(g11 g11Var, int i3) {
        this.f49927c = i3;
        this.d = g11Var;
    }

    @Override
    public final int i(int i3) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.f49927c) {
            case 0:
                g11 g11Var = this.d;
                if (g11Var.f45488x0.indexOfKey(i3) < 0 && g11Var.A0.indexOfKey(i3) < 0 && i3 != g11Var.f45449f && i3 != g11Var.E && i3 != g11Var.f45463n && i3 != g11Var.h && i3 != g11Var.f45484w && i3 != g11Var.f45434a && i3 != g11Var.f45490y) {
                    if ((i3 >= g11Var.F && i3 < g11Var.G) || g11Var.R) {
                        return 8;
                    }
                    return 5;
                }
                return g11Var.f45476s0.J;
            default:
                g11 g11Var2 = this.d;
                r01 r01Var = g11Var2.f45473r0;
                int d = r01Var.d(i3);
                if (d == 6) {
                    return g11Var2.f45476s0.J;
                }
                if (d != 5) {
                    g11 g11Var3 = r01Var.f48988s;
                    if (g11Var3.f45435a0 != 14 ? i3 <= (i10 = r01Var.f48983c) || (i3 - i10) - 1 >= g11Var3.E1.size() : (arrayList = g11Var3.D1) == null || i3 < (i11 = r01Var.f48983c) || i3 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
