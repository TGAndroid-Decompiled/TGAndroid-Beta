package qh;

import java.util.ArrayList;
import org.telegram.ui.Cells.n9;
public final class c3 extends n9 {
    public final m3 K0;
    public final o3 L0;

    public c3(o3 o3Var, m3 m3Var) {
        this.L0 = o3Var;
        this.K0 = m3Var;
    }

    @Override
    public final boolean D() {
        o3 o3Var = this.L0;
        CharSequence s10 = o3Var.f46577j3.s();
        if (s10 != null && s10.length() != 0) {
            o3Var.b5(s10);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        o3 o3Var = this.L0;
        CharSequence s10 = o3Var.f46577j3.s();
        if (s10 != null && s10.length() > 0) {
            o3Var.b5(s10);
        }
        o3Var.E2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.h0();
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
        o3 o3Var = this.L0;
        o3Var.f46587o3 = true;
        o3Var.f46588p3 = f10;
        o3Var.f46589q3 = f11;
    }

    @Override
    public final boolean k() {
        boolean z10;
        int size;
        String str;
        int length;
        o3 o3Var = this.L0;
        c3 c3Var = o3Var.f46577j3;
        ArrayList arrayList = o3Var.f46573h3;
        if (!arrayList.isEmpty() && c3Var.y() && c3Var.f24774u0 == 0 && c3Var.f24775v0 == 0 && c3Var.f24776w0 <= 0 && c3Var.f24777x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (s5.p(aVar.f46269b)) {
                str = u5.l(s5.k(aVar.f46269b));
            } else {
                str = "";
            }
            int i9 = !str.isEmpty();
            if (c3Var.f24778y0 == i9) {
                if (i9 == 1) {
                    length = str.length();
                } else {
                    length = s5.z(aVar.f46269b).length();
                }
                if (c3Var.f24779z0 >= length) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
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
