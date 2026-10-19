package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class s0 implements Utilities.Callback {
    public final int f52102a;
    public final c1 f52103b;
    public final String f52104c;

    public s0(c1 c1Var, String str, int i10) {
        this.f52102a = i10;
        this.f52103b = c1Var;
        this.f52104c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f52102a) {
            case 0:
                c1 c1Var = this.f52103b;
                if (TextUtils.equals(c1Var.d, this.f52104c)) {
                    if (c1Var.f51887t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c1Var.f51887t0 = eVar;
                    if (!c1Var.f51907v0) {
                        if (z10) {
                            c1Var.f51877s0.a(eVar);
                            c1Var.invalidate();
                            return;
                        }
                        c1Var.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                c1 c1Var2 = this.f52103b;
                if (TextUtils.equals(c1Var2.e, this.f52104c)) {
                    c1Var2.f51897u0 = eVar;
                    if (c1Var2.f51907v0 && c1Var2.f51918w0 && c1Var2.A0) {
                        c1Var2.A0 = false;
                        c1Var2.f51948z0 = System.currentTimeMillis() + 60000;
                        c1Var2.A2 = -1;
                    }
                    if (c1Var2.f51907v0) {
                        c1Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
