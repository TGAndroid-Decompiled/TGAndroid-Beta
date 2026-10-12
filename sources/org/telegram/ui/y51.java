package org.telegram.ui;

import java.util.ArrayList;
public final class y51 extends g.o {
    public final int f44307c;
    public final n71 d;

    public y51(n71 n71Var, int i10) {
        this.f44307c = i10;
        this.d = n71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f44307c) {
            case 0:
                n71 n71Var = this.d;
                if (n71Var.f40304w0.indexOfKey(i10) < 0 && n71Var.f40312z0.indexOfKey(i10) < 0 && i10 != n71Var.f40267f && i10 != n71Var.f40309y && i10 != n71Var.f40282n && i10 != n71Var.h && i10 != n71Var.v && i10 != n71Var.f40253a && i10 != n71Var.f40306x) {
                    if ((i10 >= n71Var.E && i10 < n71Var.F) || n71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return n71Var.f40292r0.J;
            default:
                n71 n71Var2 = this.d;
                x61 x61Var = n71Var2.f40289q0;
                int j3 = x61Var.j(i10);
                if (j3 == 6) {
                    return n71Var2.f40292r0.J;
                }
                if (j3 != 5) {
                    n71 n71Var3 = x61Var.f43779s;
                    if (n71Var3.W != 14 ? i10 <= (i11 = x61Var.f43774c) || (i10 - i11) - 1 >= n71Var3.C1.size() : (arrayList = n71Var3.B1) == null || i10 < (i12 = x61Var.f43774c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
