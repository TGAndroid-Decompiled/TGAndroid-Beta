package org.telegram.ui;

import java.util.ArrayList;
public final class s51 extends g.p {
    public final int f37273c;
    public final h71 d;

    public s51(h71 h71Var, int i10) {
        this.f37273c = i10;
        this.d = h71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.f37273c) {
            case 0:
                h71 h71Var = this.d;
                if (h71Var.f34164w0.indexOfKey(i10) < 0 && h71Var.f34172z0.indexOfKey(i10) < 0 && i10 != h71Var.f34127f && i10 != h71Var.f34169y && i10 != h71Var.f34142n && i10 != h71Var.h && i10 != h71Var.v && i10 != h71Var.f34114a && i10 != h71Var.f34166x) {
                    if ((i10 >= h71Var.E && i10 < h71Var.F) || h71Var.Q) {
                        return 8;
                    }
                    return 5;
                }
                return h71Var.f34152r0.J;
            default:
                h71 h71Var2 = this.d;
                r61 r61Var = h71Var2.f34149q0;
                int j3 = r61Var.j(i10);
                if (j3 == 6) {
                    return h71Var2.f34152r0.J;
                }
                if (j3 != 5) {
                    h71 h71Var3 = r61Var.f37046s;
                    if (h71Var3.W != 14 ? i10 <= (i11 = r61Var.f37042c) || (i10 - i11) - 1 >= h71Var3.C1.size() : (arrayList = h71Var3.B1) == null || i10 < (i12 = r61Var.f37042c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
