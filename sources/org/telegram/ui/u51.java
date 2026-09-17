package org.telegram.ui;

import java.util.ArrayList;
public final class u51 extends g.p {
    public final int f40941c;
    public final j71 d;

    public u51(j71 j71Var, int i10) {
        this.f40941c = i10;
        this.d = j71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f40941c) {
            case 0:
                j71 j71Var = this.d;
                if (j71Var.f37679w0.indexOfKey(i10) < 0 && j71Var.f37687z0.indexOfKey(i10) < 0 && i10 != j71Var.f37642f && i10 != j71Var.f37684y && i10 != j71Var.f37657n && i10 != j71Var.h && i10 != j71Var.v && i10 != j71Var.f37628a && i10 != j71Var.f37681x) {
                    if ((i10 >= j71Var.E && i10 < j71Var.F) || j71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return j71Var.f37667r0.J;
            default:
                j71 j71Var2 = this.d;
                t61 t61Var = j71Var2.f37664q0;
                int j3 = t61Var.j(i10);
                if (j3 == 6) {
                    return j71Var2.f37667r0.J;
                }
                if (j3 != 5) {
                    j71 j71Var3 = t61Var.f40641s;
                    if (j71Var3.W != 14 ? i10 <= (i11 = t61Var.f40636c) || (i10 - i11) - 1 >= j71Var3.C1.size() : (arrayList = j71Var3.B1) == null || i10 < (i12 = t61Var.f40636c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
