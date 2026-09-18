package org.telegram.ui;

import java.util.ArrayList;
public final class u51 extends g.p {
    public final int f37947c;
    public final i71 d;

    public u51(i71 i71Var, int i10) {
        this.f37947c = i10;
        this.d = i71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f37947c) {
            case 0:
                i71 i71Var = this.d;
                if (i71Var.f34498w0.indexOfKey(i10) < 0 && i71Var.f34506z0.indexOfKey(i10) < 0 && i10 != i71Var.f34461f && i10 != i71Var.f34503y && i10 != i71Var.f34476n && i10 != i71Var.h && i10 != i71Var.v && i10 != i71Var.f34448a && i10 != i71Var.f34500x) {
                    if ((i10 >= i71Var.E && i10 < i71Var.F) || i71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return i71Var.f34486r0.J;
            default:
                i71 i71Var2 = this.d;
                s61 s61Var = i71Var2.f34483q0;
                int j3 = s61Var.j(i10);
                if (j3 == 6) {
                    return i71Var2.f34486r0.J;
                }
                if (j3 != 5) {
                    i71 i71Var3 = s61Var.f37400s;
                    if (i71Var3.W != 14 ? i10 <= (i11 = s61Var.f37396c) || (i10 - i11) - 1 >= i71Var3.C1.size() : (arrayList = i71Var3.B1) == null || i10 < (i12 = s61Var.f37396c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
