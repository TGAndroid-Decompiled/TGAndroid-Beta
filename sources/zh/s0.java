package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class s0 implements Utilities.Callback {
    public final int f52100a;
    public final c1 f52101b;
    public final String f52102c;

    public s0(c1 c1Var, String str, int i10) {
        this.f52100a = i10;
        this.f52101b = c1Var;
        this.f52102c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f52100a) {
            case 0:
                c1 c1Var = this.f52101b;
                if (TextUtils.equals(c1Var.d, this.f52102c)) {
                    if (c1Var.f51885t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c1Var.f51885t0 = eVar;
                    if (!c1Var.f51905v0) {
                        if (z10) {
                            f fVar = c1Var.f51875s0;
                            fVar.f51991m = eVar;
                            fVar.f51992n = null;
                            fVar.f51995q = 2;
                            fVar.f51993o = 0.0f;
                            fVar.f51994p = 0L;
                            fVar.E = 0L;
                            fVar.F = false;
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
                c1 c1Var2 = this.f52101b;
                if (TextUtils.equals(c1Var2.e, this.f52102c)) {
                    c1Var2.f51895u0 = eVar;
                    if (c1Var2.f51905v0 && c1Var2.f51916w0 && c1Var2.A0) {
                        c1Var2.A0 = false;
                        c1Var2.f51946z0 = System.currentTimeMillis() + 60000;
                        c1Var2.A2 = -1;
                    }
                    if (c1Var2.f51905v0) {
                        c1Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
