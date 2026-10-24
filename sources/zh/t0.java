package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class t0 implements Utilities.Callback {
    public final int f52588a;
    public final c1 f52589b;
    public final String f52590c;

    public t0(c1 c1Var, String str, int i10) {
        this.f52588a = i10;
        this.f52589b = c1Var;
        this.f52590c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f52588a) {
            case 0:
                c1 c1Var = this.f52589b;
                if (TextUtils.equals(c1Var.d, this.f52590c)) {
                    if (c1Var.f52357t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c1Var.f52357t0 = eVar;
                    if (!c1Var.f52377v0) {
                        if (z10) {
                            c1Var.f52347s0.a(eVar);
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
                c1 c1Var2 = this.f52589b;
                if (TextUtils.equals(c1Var2.e, this.f52590c)) {
                    c1Var2.f52367u0 = eVar;
                    if (c1Var2.f52377v0 && c1Var2.f52388w0 && c1Var2.A0) {
                        c1Var2.A0 = false;
                        c1Var2.f52418z0 = System.currentTimeMillis() + 60000;
                        c1Var2.A2 = -1;
                    }
                    if (c1Var2.f52377v0) {
                        c1Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
