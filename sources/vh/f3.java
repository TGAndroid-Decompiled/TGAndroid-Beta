package vh;

import java.util.ArrayList;
import org.telegram.ui.Cells.m9;
public final class f3 extends m9 {
    public final p3 K0;
    public final r3 L0;

    public f3(r3 r3Var, p3 p3Var) {
        this.L0 = r3Var;
        this.K0 = p3Var;
    }

    @Override
    public final boolean D() {
        r3 r3Var = this.L0;
        CharSequence s6 = r3Var.f46124k3.s();
        if (s6 != null && s6.length() != 0) {
            r3Var.b5(s6);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        r3 r3Var = this.L0;
        CharSequence s6 = r3Var.f46124k3.s();
        if (s6 != null && s6.length() > 0) {
            r3Var.b5(s6);
        }
        r3Var.E2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.n();
    }

    @Override
    public final void I() {
        this.L0.c4();
    }

    @Override
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.S4();
    }

    @Override
    public final void L(float f10, float f11) {
        r3 r3Var = this.L0;
        r3Var.f46134p3 = true;
        r3Var.f46135q3 = f10;
        r3Var.f46136r3 = f11;
    }

    @Override
    public final boolean k() {
        boolean z4;
        int size;
        String str;
        int length;
        r3 r3Var = this.L0;
        f3 f3Var = r3Var.f46124k3;
        ArrayList arrayList = r3Var.f46120i3;
        if (!arrayList.isEmpty() && f3Var.y() && f3Var.f21401u0 == 0 && f3Var.f21402v0 == 0 && f3Var.f21403w0 <= 0 && f3Var.f21404x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (v5.p(aVar.f45775b)) {
                str = x5.l(v5.k(aVar.f45775b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (f3Var.f21405y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = v5.z(aVar.f45775b).length();
                }
                if (f3Var.f21406z0 >= length) {
                    z4 = true;
                    return !z4;
                }
            }
        }
        z4 = false;
        return !z4;
    }

    @Override
    public final int p() {
        return this.L0.getPaddingBottom();
    }

    @Override
    public final int q() {
        return this.L0.getPaddingTop();
    }
}
