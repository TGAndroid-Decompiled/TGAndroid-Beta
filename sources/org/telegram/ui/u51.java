package org.telegram.ui;

import java.util.ArrayList;
public final class u51 extends g.p {
    public final int f40940c;
    public final j71 d;

    public u51(j71 j71Var, int i10) {
        this.f40940c = i10;
        this.d = j71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f40940c) {
            case 0:
                j71 j71Var = this.d;
                if (j71Var.f37678w0.indexOfKey(i10) < 0 && j71Var.f37686z0.indexOfKey(i10) < 0 && i10 != j71Var.f37641f && i10 != j71Var.f37683y && i10 != j71Var.f37656n && i10 != j71Var.h && i10 != j71Var.v && i10 != j71Var.f37627a && i10 != j71Var.f37680x) {
                    if ((i10 >= j71Var.E && i10 < j71Var.F) || j71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return j71Var.f37666r0.J;
            default:
                j71 j71Var2 = this.d;
                t61 t61Var = j71Var2.f37663q0;
                int j3 = t61Var.j(i10);
                if (j3 == 6) {
                    return j71Var2.f37666r0.J;
                }
                if (j3 != 5) {
                    j71 j71Var3 = t61Var.f40640s;
                    if (j71Var3.W != 14 ? i10 <= (i11 = t61Var.f40635c) || (i10 - i11) - 1 >= j71Var3.C1.size() : (arrayList = j71Var3.B1) == null || i10 < (i12 = t61Var.f40635c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
