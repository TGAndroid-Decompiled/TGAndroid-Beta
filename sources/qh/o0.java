package qh;

import android.text.TextUtils;
import org.telegram.messenger.r20;
public final class o0 implements r20 {
    public final int f45717a;
    public final x0 f45718b;
    public final String f45719c;

    public o0(x0 x0Var, String str, int i10) {
        this.f45717a = i10;
        this.f45718b = x0Var;
        this.f45719c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        f fVar = (f) obj;
        switch (this.f45717a) {
            case 0:
                x0 x0Var = this.f45718b;
                if (TextUtils.equals(x0Var.d, this.f45719c)) {
                    if (x0Var.f45996t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x0Var.f45996t0 = fVar;
                    if (!x0Var.f46016v0) {
                        if (z10) {
                            x0Var.f45986s0.a(fVar);
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
                x0 x0Var2 = this.f45718b;
                if (TextUtils.equals(x0Var2.e, this.f45719c)) {
                    x0Var2.f46006u0 = fVar;
                    if (x0Var2.f46016v0 && x0Var2.f46027w0 && x0Var2.A0) {
                        x0Var2.A0 = false;
                        x0Var2.f46057z0 = System.currentTimeMillis() + 60000;
                        x0Var2.A2 = -1;
                    }
                    if (x0Var2.f46016v0) {
                        x0Var2.j1(fVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
