package org.telegram.ui;

import java.util.ArrayList;
public final class s11 extends g.o {
    public final int f41197c;
    public final g31 d;

    public s11(g31 g31Var, int i10) {
        this.f41197c = i10;
        this.d = g31Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f41197c) {
            case 0:
                g31 g31Var = this.d;
                if (g31Var.f37337w0.indexOfKey(i10) < 0 && g31Var.f37345z0.indexOfKey(i10) < 0 && i10 != g31Var.f37300f && i10 != g31Var.D && i10 != g31Var.f37315n && i10 != g31Var.h && i10 != g31Var.f37336w && i10 != g31Var.f37287a && i10 != g31Var.f37342y) {
                    if ((i10 >= g31Var.E && i10 < g31Var.F) || g31Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return g31Var.f37325r0.J;
            default:
                g31 g31Var2 = this.d;
                r21 r21Var = g31Var2.f37322q0;
                int d = r21Var.d(i10);
                if (d == 6) {
                    return g31Var2.f37325r0.J;
                }
                if (d != 5) {
                    g31 g31Var3 = r21Var.f40965s;
                    if (g31Var3.W != 14 ? i10 <= (i11 = r21Var.f40961c) || (i10 - i11) - 1 >= g31Var3.D1.size() : (arrayList = g31Var3.C1) == null || i10 < (i12 = r21Var.f40961c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
