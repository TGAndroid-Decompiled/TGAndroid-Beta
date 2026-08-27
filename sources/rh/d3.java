package rh;

import java.util.ArrayList;
import org.telegram.ui.Cells.j9;

public final class d3 extends j9 {
    public final n3 K0;
    public final p3 L0;

    public d3(p3 p3Var, n3 n3Var) {
        this.L0 = p3Var;
        this.K0 = n3Var;
    }

    @Override
    public final boolean D() {
        p3 p3Var = this.L0;
        CharSequence charSequenceS = p3Var.f47352j3.s();
        if (charSequenceS == null || charSequenceS.length() == 0) {
            return true;
        }
        p3Var.b5(charSequenceS);
        return true;
    }

    @Override
    public final void E() {
        p3 p3Var = this.L0;
        CharSequence charSequenceS = p3Var.f47352j3.s();
        if (charSequenceS != null && charSequenceS.length() > 0) {
            p3Var.b5(charSequenceS);
        }
        p3Var.E2();
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
        p3 p3Var = this.L0;
        p3Var.f47362o3 = true;
        p3Var.f47363p3 = f10;
        p3Var.f47364q3 = f11;
    }

    @Override
    public final boolean k() {
        boolean z10;
        int size;
        p3 p3Var = this.L0;
        d3 d3Var = p3Var.f47352j3;
        ArrayList arrayList = p3Var.f47348h3;
        if (!arrayList.isEmpty() && d3Var.y() && d3Var.f24540u0 == 0 && d3Var.f24541v0 == 0 && d3Var.f24542w0 <= 0 && d3Var.f24543x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String strL = t5.p(aVar.f47028b) ? v5.l(t5.k(aVar.f47028b)) : "";
            boolean z11 = !strL.isEmpty();
            if (d3Var.f24544y0 == z11) {
                if (d3Var.f24545z0 >= (z11 ? strL.length() : t5.z(aVar.f47028b).length())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
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
