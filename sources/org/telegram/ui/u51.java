package org.telegram.ui;

import java.util.ArrayList;
public final class u51 extends g.p {
    public final int f40968c;
    public final j71 d;

    public u51(j71 j71Var, int i10) {
        this.f40968c = i10;
        this.d = j71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f40968c) {
            case 0:
                j71 j71Var = this.d;
                if (j71Var.f37706w0.indexOfKey(i10) < 0 && j71Var.f37714z0.indexOfKey(i10) < 0 && i10 != j71Var.f37669f && i10 != j71Var.f37711y && i10 != j71Var.f37684n && i10 != j71Var.h && i10 != j71Var.v && i10 != j71Var.f37655a && i10 != j71Var.f37708x) {
                    if ((i10 >= j71Var.E && i10 < j71Var.F) || j71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return j71Var.f37694r0.J;
            default:
                j71 j71Var2 = this.d;
                t61 t61Var = j71Var2.f37691q0;
                int j3 = t61Var.j(i10);
                if (j3 == 6) {
                    return j71Var2.f37694r0.J;
                }
                if (j3 != 5) {
                    j71 j71Var3 = t61Var.f40668s;
                    if (j71Var3.W != 14 ? i10 <= (i11 = t61Var.f40663c) || (i10 - i11) - 1 >= j71Var3.C1.size() : (arrayList = j71Var3.B1) == null || i10 < (i12 = t61Var.f40663c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
