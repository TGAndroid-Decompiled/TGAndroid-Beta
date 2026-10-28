package org.telegram.ui;
public final class v20 extends g.o {
    public final x50 f44163c;

    public v20(x50 x50Var) {
        this.f44163c = x50Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r50 r50Var;
        int i12;
        int i13;
        int i14;
        if (x50.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!x50.G3 && i10 >= (i12 = (r50Var = this.f44163c.P).G) && i10 < (i13 = r50Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (x50.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (x50.F3) {
                if (i15 == 1) {
                    return 6;
                }
                if (i15 != 2) {
                    return 2;
                }
                return 3;
            }
            return i14;
        }
        return i11;
    }
}
