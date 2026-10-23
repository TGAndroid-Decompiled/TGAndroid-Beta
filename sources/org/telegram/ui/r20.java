package org.telegram.ui;
public final class r20 extends g.o {
    public final u50 f40978c;

    public r20(u50 u50Var) {
        this.f40978c = u50Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        o50 o50Var;
        int i12;
        int i13;
        int i14;
        if (u50.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!u50.G3 && i10 >= (i12 = (o50Var = this.f40978c.P).G) && i10 < (i13 = o50Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (u50.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (u50.F3) {
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
