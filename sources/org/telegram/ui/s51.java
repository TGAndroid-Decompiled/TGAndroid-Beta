package org.telegram.ui;

import java.util.ArrayList;
public final class s51 extends g.p {
    public final int f37200c;
    public final g71 d;

    public s51(g71 g71Var, int i10) {
        this.f37200c = i10;
        this.d = g71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f37200c) {
            case 0:
                g71 g71Var = this.d;
                if (g71Var.f33760w0.indexOfKey(i10) < 0 && g71Var.f33768z0.indexOfKey(i10) < 0 && i10 != g71Var.f33723f && i10 != g71Var.f33765y && i10 != g71Var.f33738n && i10 != g71Var.h && i10 != g71Var.v && i10 != g71Var.f33710a && i10 != g71Var.f33762x) {
                    if ((i10 >= g71Var.E && i10 < g71Var.F) || g71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return g71Var.f33748r0.J;
            default:
                g71 g71Var2 = this.d;
                q61 q61Var = g71Var2.f33745q0;
                int j3 = q61Var.j(i10);
                if (j3 == 6) {
                    return g71Var2.f33748r0.J;
                }
                if (j3 != 5) {
                    g71 g71Var3 = q61Var.f36704s;
                    if (g71Var3.W != 14 ? i10 <= (i11 = q61Var.f36700c) || (i10 - i11) - 1 >= g71Var3.C1.size() : (arrayList = g71Var3.B1) == null || i10 < (i12 = q61Var.f36700c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
