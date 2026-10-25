package org.telegram.ui;
public final class t20 extends g.o {
    public final v50 f43660c;

    public t20(v50 v50Var) {
        this.f43660c = v50Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p50 p50Var;
        int i12;
        int i13;
        int i14;
        if (v50.F3) {
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (!v50.G3 && i10 >= (i12 = (p50Var = this.f43660c.P).G) && i10 < (i13 = p50Var.H)) {
            int i15 = i13 - i12;
            if (i10 == i13 - 1 && (v50.F3 || i15 % 2 != 0)) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (v50.F3) {
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
