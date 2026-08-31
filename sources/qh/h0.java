package qh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h0 implements Runnable {
    public final int f45371a;
    public final n0 f45372b;

    public h0(n0 n0Var, int i10) {
        this.f45371a = i10;
        this.f45372b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f45371a) {
            case 0:
                this.f45372b.b();
                return;
            case 1:
                n0 n0Var = this.f45372b;
                n0Var.f45748e = false;
                k0 k0Var = n0Var.f45752s;
                if (k0Var != null) {
                    k0Var.a(true);
                    n0Var.f45752s = null;
                }
                m0 m0Var = n0Var.f45750n;
                if (m0Var != null) {
                    m0Var.a();
                }
                n0Var.f45747c = false;
                n0Var.d();
                return;
            default:
                n0 n0Var2 = this.f45372b;
                if (n0Var2.f45747c && n0Var2.f45751r != null) {
                    n0Var2.f45750n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    n0Var2.f45747c = false;
                    n0Var2.d();
                    return;
                }
                return;
        }
    }
}
