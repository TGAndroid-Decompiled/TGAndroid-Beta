package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class t0 implements Utilities.Callback {
    public final int f52126a;
    public final c1 f52127b;
    public final String f52128c;

    public t0(c1 c1Var, String str, int i10) {
        this.f52126a = i10;
        this.f52127b = c1Var;
        this.f52128c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f52126a) {
            case 0:
                c1 c1Var = this.f52127b;
                if (TextUtils.equals(c1Var.d, this.f52128c)) {
                    if (c1Var.f51895t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c1Var.f51895t0 = eVar;
                    if (!c1Var.f51915v0) {
                        if (z10) {
                            c1Var.f51885s0.a(eVar);
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
                c1 c1Var2 = this.f52127b;
                if (TextUtils.equals(c1Var2.e, this.f52128c)) {
                    c1Var2.f51905u0 = eVar;
                    if (c1Var2.f51915v0 && c1Var2.f51926w0 && c1Var2.A0) {
                        c1Var2.A0 = false;
                        c1Var2.f51956z0 = System.currentTimeMillis() + 60000;
                        c1Var2.A2 = -1;
                    }
                    if (c1Var2.f51915v0) {
                        c1Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
