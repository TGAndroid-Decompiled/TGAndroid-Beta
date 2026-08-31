package wh;

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
        CharSequence s6 = r3Var.f49991k3.s();
        if (s6 != null && s6.length() != 0) {
            r3Var.b5(s6);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        r3 r3Var = this.L0;
        CharSequence s6 = r3Var.f49991k3.s();
        if (s6 != null && s6.length() > 0) {
            r3Var.b5(s6);
        }
        r3Var.E2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.q();
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
        r3Var.f50001p3 = true;
        r3Var.f50002q3 = f10;
        r3Var.f50003r3 = f11;
    }

    @Override
    public final boolean k() {
        boolean z4;
        int size;
        String str;
        int length;
        r3 r3Var = this.L0;
        f3 f3Var = r3Var.f49991k3;
        ArrayList arrayList = r3Var.f49987i3;
        if (!arrayList.isEmpty() && f3Var.y() && f3Var.f23175u0 == 0 && f3Var.f23176v0 == 0 && f3Var.f23177w0 <= 0 && f3Var.f23178x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (v5.p(aVar.f49616b)) {
                str = x5.l(v5.k(aVar.f49616b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (f3Var.f23179y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = v5.z(aVar.f49616b).length();
                }
                if (f3Var.f23180z0 >= length) {
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
