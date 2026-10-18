package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class j0 implements Utilities.Callback {
    public final int f51793a;
    public final t0 f51794b;
    public final String f51795c;

    public j0(t0 t0Var, String str, int i10) {
        this.f51793a = i10;
        this.f51794b = t0Var;
        this.f51795c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f51793a) {
            case 0:
                t0 t0Var = this.f51794b;
                if (TextUtils.equals(t0Var.d, this.f51795c)) {
                    if (t0Var.f52081t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t0Var.f52081t0 = eVar;
                    if (!t0Var.f52101v0) {
                        if (z10) {
                            f fVar = t0Var.f52071s0;
                            fVar.f51735m = eVar;
                            fVar.f51736n = null;
                            fVar.f51739q = 2;
                            fVar.f51737o = 0.0f;
                            fVar.f51738p = 0L;
                            fVar.E = 0L;
                            fVar.F = false;
                            t0Var.invalidate();
                            return;
                        }
                        t0Var.i1(eVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f51794b;
                if (TextUtils.equals(t0Var2.e, this.f51795c)) {
                    t0Var2.f52091u0 = eVar;
                    if (t0Var2.f52101v0 && t0Var2.f52112w0 && t0Var2.A0) {
                        t0Var2.A0 = false;
                        t0Var2.f52142z0 = System.currentTimeMillis() + 60000;
                        t0Var2.f52144z2 = -1;
                    }
                    if (t0Var2.f52101v0) {
                        t0Var2.i1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
