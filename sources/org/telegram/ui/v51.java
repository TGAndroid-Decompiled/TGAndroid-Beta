package org.telegram.ui;

import java.util.ArrayList;
public final class v51 extends g.p {
    public final int f38415c;
    public final j71 d;

    public v51(j71 j71Var, int i10) {
        this.f38415c = i10;
        this.d = j71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f38415c) {
            case 0:
                j71 j71Var = this.d;
                if (j71Var.f34824w0.indexOfKey(i10) < 0 && j71Var.f34832z0.indexOfKey(i10) < 0 && i10 != j71Var.f34787f && i10 != j71Var.f34829y && i10 != j71Var.f34802n && i10 != j71Var.h && i10 != j71Var.v && i10 != j71Var.f34774a && i10 != j71Var.f34826x) {
                    if ((i10 >= j71Var.E && i10 < j71Var.F) || j71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return j71Var.f34812r0.J;
            default:
                j71 j71Var2 = this.d;
                t61 t61Var = j71Var2.f34809q0;
                int j3 = t61Var.j(i10);
                if (j3 == 6) {
                    return j71Var2.f34812r0.J;
                }
                if (j3 != 5) {
                    j71 j71Var3 = t61Var.f37644s;
                    if (j71Var3.W != 14 ? i10 <= (i11 = t61Var.f37640c) || (i10 - i11) - 1 >= j71Var3.C1.size() : (arrayList = j71Var3.B1) == null || i10 < (i12 = t61Var.f37640c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
