package org.telegram.ui;

import java.util.ArrayList;
public final class x51 extends g.p {
    public final int f38584c;
    public final l71 d;

    public x51(l71 l71Var, int i10) {
        this.f38584c = i10;
        this.d = l71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f38584c) {
            case 0:
                l71 l71Var = this.d;
                if (l71Var.f34602w0.indexOfKey(i10) < 0 && l71Var.f34610z0.indexOfKey(i10) < 0 && i10 != l71Var.f34565f && i10 != l71Var.f34607y && i10 != l71Var.f34580n && i10 != l71Var.h && i10 != l71Var.v && i10 != l71Var.f34552a && i10 != l71Var.f34604x) {
                    if ((i10 >= l71Var.E && i10 < l71Var.F) || l71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return l71Var.f34590r0.J;
            default:
                l71 l71Var2 = this.d;
                v61 v61Var = l71Var2.f34587q0;
                int j3 = v61Var.j(i10);
                if (j3 == 6) {
                    return l71Var2.f34590r0.J;
                }
                if (j3 != 5) {
                    l71 l71Var3 = v61Var.f37426s;
                    if (l71Var3.W != 14 ? i10 <= (i11 = v61Var.f37422c) || (i10 - i11) - 1 >= l71Var3.C1.size() : (arrayList = l71Var3.B1) == null || i10 < (i12 = v61Var.f37422c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
