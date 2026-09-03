package vh;

import java.util.ArrayList;
import org.telegram.ui.Cells.l9;
public final class g3 extends l9 {
    public final q3 K0;
    public final s3 L0;

    public g3(s3 s3Var, q3 q3Var) {
        this.L0 = s3Var;
        this.K0 = q3Var;
    }

    @Override
    public final boolean D() {
        s3 s3Var = this.L0;
        CharSequence s6 = s3Var.f46221k3.s();
        if (s6 != null && s6.length() != 0) {
            s3Var.a5(s6);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        s3 s3Var = this.L0;
        CharSequence s6 = s3Var.f46221k3.s();
        if (s6 != null && s6.length() > 0) {
            s3Var.a5(s6);
        }
        s3Var.D2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.o();
    }

    @Override
    public final void I() {
        this.L0.b4();
    }

    @Override
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.R4();
    }

    @Override
    public final void L(float f10, float f11) {
        s3 s3Var = this.L0;
        s3Var.f46231p3 = true;
        s3Var.f46232q3 = f10;
        s3Var.f46233r3 = f11;
    }

    @Override
    public final boolean k() {
        boolean z4;
        int size;
        String str;
        int length;
        s3 s3Var = this.L0;
        g3 g3Var = s3Var.f46221k3;
        ArrayList arrayList = s3Var.f46217i3;
        if (!arrayList.isEmpty() && g3Var.y() && g3Var.f21331u0 == 0 && g3Var.f21332v0 == 0 && g3Var.f21333w0 <= 0 && g3Var.f21334x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (w5.p(aVar.f45853b)) {
                str = y5.l(w5.k(aVar.f45853b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (g3Var.f21335y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = w5.z(aVar.f45853b).length();
                }
                if (g3Var.f21336z0 >= length) {
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
