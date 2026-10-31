package xg;

import org.telegram.messenger.d20;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b9;
public final class b implements wg.c {
    public final int f53674a;
    public final p6 f53675b;

    public b(int i10, p6 p6Var) {
        this.f53674a = i10;
        this.f53675b = p6Var;
    }

    @Override
    public final int g(p6 p6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f53674a) {
            case 0:
                if (!b9.c(d20.f15147s0, this.f53675b)) {
                    return i0.b.o(t6.w0(t6.Ge, p6Var), 255);
                }
                if (sc.e(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return t6.r1(f7, t6.w0(t6.Ge, p6Var));
            case 1:
                if (!b9.c(d20.f15147s0, this.f53675b)) {
                    if (z10) {
                        i10 = t6.f21206s8;
                    } else {
                        i10 = t6.Qe;
                    }
                    return i0.b.o(t6.w0(i10, p6Var), 255);
                }
                if (sc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return t6.r1(f10, t6.w0(t6.Qe, p6Var));
            default:
                if (!b9.c(d20.f15147s0, this.f53675b)) {
                    if (z10) {
                        i11 = t6.f21206s8;
                    } else {
                        i11 = t6.Qe;
                    }
                    return i0.b.o(t6.w0(i11, p6Var), 255);
                }
                if (sc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return t6.r1(f11, t6.w0(t6.Qe, p6Var));
        }
    }
}
