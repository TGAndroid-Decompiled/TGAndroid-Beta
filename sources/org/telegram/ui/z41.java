package org.telegram.ui;

import java.util.ArrayList;
public final class z41 extends f2.v {
    public final int f40672c;
    public final q61 d;

    public z41(q61 q61Var, int i10) {
        this.f40672c = i10;
        this.d = q61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f40672c) {
            case 0:
                q61 q61Var = this.d;
                if (q61Var.f37637t0.indexOfKey(i10) < 0 && q61Var.f37644w0.indexOfKey(i10) < 0 && i10 != q61Var.f37607f && i10 != q61Var.f37649y && i10 != q61Var.f37622n && i10 != q61Var.h && i10 != q61Var.v && i10 != q61Var.f37594a && i10 != q61Var.f37646x) {
                    if ((i10 >= q61Var.B && i10 < q61Var.C) || q61Var.N) {
                        return 8;
                    }
                    return 5;
                }
                return q61Var.f37625o0.J;
            default:
                q61 q61Var2 = this.d;
                z51 z51Var = q61Var2.f37623n0;
                int j10 = z51Var.j(i10);
                if (j10 == 6) {
                    return q61Var2.f37625o0.J;
                }
                if (j10 != 5) {
                    q61 q61Var3 = z51Var.f40689s;
                    if (q61Var3.T != 14 ? i10 <= (i11 = z51Var.f40685c) || (i10 - i11) - 1 >= q61Var3.f37653z1.size() : (arrayList = q61Var3.f37651y1) == null || i10 < (i12 = z51Var.f40685c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
