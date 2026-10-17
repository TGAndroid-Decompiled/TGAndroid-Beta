package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class q0 implements Utilities.Callback {
    public final int f52087a;
    public final b1 f52088b;
    public final String f52089c;

    public q0(b1 b1Var, String str, int i10) {
        this.f52087a = i10;
        this.f52088b = b1Var;
        this.f52089c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        g gVar = (g) obj;
        switch (this.f52087a) {
            case 0:
                b1 b1Var = this.f52088b;
                if (TextUtils.equals(b1Var.d, this.f52089c)) {
                    if (b1Var.f51856t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b1Var.f51856t0 = gVar;
                    if (!b1Var.f51874v0) {
                        if (z10) {
                            h hVar = b1Var.f51847s0;
                            hVar.f52010m = gVar;
                            hVar.f52011n = null;
                            hVar.f52014q = 2;
                            hVar.f52012o = 0.0f;
                            hVar.f52013p = 0L;
                            hVar.E = 0L;
                            hVar.F = false;
                            b1Var.invalidate();
                            return;
                        }
                        b1Var.c1(gVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                b1 b1Var2 = this.f52088b;
                if (TextUtils.equals(b1Var2.e, this.f52089c)) {
                    b1Var2.f51865u0 = gVar;
                    if (b1Var2.f51874v0 && b1Var2.f51884w0 && b1Var2.A0) {
                        b1Var2.A0 = false;
                        b1Var2.f51912z0 = System.currentTimeMillis() + 60000;
                        b1Var2.A2 = -1;
                    }
                    if (b1Var2.f51874v0) {
                        b1Var2.c1(gVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
