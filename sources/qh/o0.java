package qh;

import android.text.TextUtils;
import org.telegram.messenger.q20;
public final class o0 implements q20 {
    public final int f45706a;
    public final x0 f45707b;
    public final String f45708c;

    public o0(x0 x0Var, String str, int i10) {
        this.f45706a = i10;
        this.f45707b = x0Var;
        this.f45708c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        f fVar = (f) obj;
        switch (this.f45706a) {
            case 0:
                x0 x0Var = this.f45707b;
                if (TextUtils.equals(x0Var.d, this.f45708c)) {
                    if (x0Var.f45985t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x0Var.f45985t0 = fVar;
                    if (!x0Var.f46005v0) {
                        if (z10) {
                            x0Var.f45975s0.a(fVar);
                            x0Var.invalidate();
                            return;
                        }
                        x0Var.j1(fVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                x0 x0Var2 = this.f45707b;
                if (TextUtils.equals(x0Var2.e, this.f45708c)) {
                    x0Var2.f45995u0 = fVar;
                    if (x0Var2.f46005v0 && x0Var2.f46016w0 && x0Var2.A0) {
                        x0Var2.A0 = false;
                        x0Var2.f46046z0 = System.currentTimeMillis() + 60000;
                        x0Var2.A2 = -1;
                    }
                    if (x0Var2.f46005v0) {
                        x0Var2.j1(fVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
