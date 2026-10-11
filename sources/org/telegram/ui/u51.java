package org.telegram.ui;

import java.util.ArrayList;
public final class u51 extends g.o {
    public final int f42399c;
    public final j71 d;

    public u51(j71 j71Var, int i10) {
        this.f42399c = i10;
        this.d = j71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f42399c) {
            case 0:
                j71 j71Var = this.d;
                if (j71Var.f38960w0.indexOfKey(i10) < 0 && j71Var.f38968z0.indexOfKey(i10) < 0 && i10 != j71Var.f38923f && i10 != j71Var.f38965y && i10 != j71Var.f38938n && i10 != j71Var.h && i10 != j71Var.v && i10 != j71Var.f38909a && i10 != j71Var.f38962x) {
                    if ((i10 >= j71Var.E && i10 < j71Var.F) || j71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return j71Var.f38948r0.J;
            default:
                j71 j71Var2 = this.d;
                t61 t61Var = j71Var2.f38945q0;
                int j3 = t61Var.j(i10);
                if (j3 == 6) {
                    return j71Var2.f38948r0.J;
                }
                if (j3 != 5) {
                    j71 j71Var3 = t61Var.f42128s;
                    if (j71Var3.W != 14 ? i10 <= (i11 = t61Var.f42123c) || (i10 - i11) - 1 >= j71Var3.C1.size() : (arrayList = j71Var3.B1) == null || i10 < (i12 = t61Var.f42123c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
