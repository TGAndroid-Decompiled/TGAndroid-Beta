package th;

import java.util.ArrayList;
import org.telegram.ui.Cells.k9;
public final class d3 extends k9 {
    public final n3 K0;
    public final p3 L0;

    public d3(p3 p3Var, n3 n3Var) {
        this.L0 = p3Var;
        this.K0 = n3Var;
    }

    @Override
    public final boolean D() {
        p3 p3Var = this.L0;
        CharSequence s10 = p3Var.f48650j3.s();
        if (s10 != null && s10.length() != 0) {
            p3Var.b5(s10);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        p3 p3Var = this.L0;
        CharSequence s10 = p3Var.f48650j3.s();
        if (s10 != null && s10.length() > 0) {
            p3Var.b5(s10);
        }
        p3Var.E2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.b0();
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
    public final void L(float f9, float f10) {
        p3 p3Var = this.L0;
        p3Var.f48660o3 = true;
        p3Var.f48661p3 = f9;
        p3Var.f48662q3 = f10;
    }

    @Override
    public final boolean k() {
        boolean z10;
        int size;
        String str;
        int length;
        p3 p3Var = this.L0;
        d3 d3Var = p3Var.f48650j3;
        ArrayList arrayList = p3Var.f48646h3;
        if (!arrayList.isEmpty() && d3Var.y() && d3Var.f24607u0 == 0 && d3Var.f24608v0 == 0 && d3Var.f24609w0 <= 0 && d3Var.f24610x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (t5.p(aVar.f48328b)) {
                str = v5.l(t5.k(aVar.f48328b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (d3Var.f24611y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = t5.z(aVar.f48328b).length();
                }
                if (d3Var.f24612z0 >= length) {
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
