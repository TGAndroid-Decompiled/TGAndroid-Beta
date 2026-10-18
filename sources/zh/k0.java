package zh;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class k0 implements Utilities.Callback {
    public final int f51752a;
    public final u0 f51753b;
    public final String f51754c;

    public k0(u0 u0Var, String str, int i10) {
        this.f51752a = i10;
        this.f51753b = u0Var;
        this.f51754c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        switch (this.f51752a) {
            case 0:
                u0 u0Var = this.f51753b;
                if (TextUtils.equals(u0Var.d, this.f51754c)) {
                    if (u0Var.f52040t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u0Var.f52040t0 = eVar;
                    if (!u0Var.f52060v0) {
                        if (z10) {
                            f fVar = u0Var.f52030s0;
                            fVar.f51688m = eVar;
                            fVar.f51689n = null;
                            fVar.f51692q = 2;
                            fVar.f51690o = 0.0f;
                            fVar.f51691p = 0L;
                            fVar.E = 0L;
                            fVar.F = false;
                            u0Var.invalidate();
                            return;
                        }
                        u0Var.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f51753b;
                if (TextUtils.equals(u0Var2.e, this.f51754c)) {
                    u0Var2.f52050u0 = eVar;
                    if (u0Var2.f52060v0 && u0Var2.f52071w0 && u0Var2.A0) {
                        u0Var2.A0 = false;
                        u0Var2.f52101z0 = System.currentTimeMillis() + 60000;
                        u0Var2.A2 = -1;
                    }
                    if (u0Var2.f52060v0) {
                        u0Var2.j1(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
