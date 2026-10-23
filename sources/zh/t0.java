package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class t0 implements Utilities.Callback {
    public final int f52127a;
    public final c1 f52128b;
    public final String f52129c;

    public t0(c1 c1Var, String str, int i10) {
        this.f52127a = i10;
        this.f52128b = c1Var;
        this.f52129c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f52127a) {
            case 0:
                c1 c1Var = this.f52128b;
                if (TextUtils.equals(c1Var.d, this.f52129c)) {
                    if (c1Var.f51896t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c1Var.f51896t0 = eVar;
                    if (!c1Var.f51916v0) {
                        if (z10) {
                            c1Var.f51886s0.a(eVar);
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
                c1 c1Var2 = this.f52128b;
                if (TextUtils.equals(c1Var2.e, this.f52129c)) {
                    c1Var2.f51906u0 = eVar;
                    if (c1Var2.f51916v0 && c1Var2.f51927w0 && c1Var2.A0) {
                        c1Var2.A0 = false;
                        c1Var2.f51957z0 = System.currentTimeMillis() + 60000;
                        c1Var2.A2 = -1;
                    }
                    if (c1Var2.f51916v0) {
                        c1Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
