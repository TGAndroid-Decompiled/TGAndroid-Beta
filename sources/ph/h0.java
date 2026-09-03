package ph;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h0 implements Runnable {
    public final int f41733a;
    public final n0 f41734b;

    public h0(n0 n0Var, int i10) {
        this.f41733a = i10;
        this.f41734b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f41733a) {
            case 0:
                this.f41734b.b();
                return;
            case 1:
                n0 n0Var = this.f41734b;
                n0Var.e = false;
                k0 k0Var = n0Var.f42032s;
                if (k0Var != null) {
                    k0Var.a(true);
                    n0Var.f42032s = null;
                }
                m0 m0Var = n0Var.f42030n;
                if (m0Var != null) {
                    m0Var.a();
                }
                n0Var.f42028c = false;
                n0Var.d();
                return;
            default:
                n0 n0Var2 = this.f41734b;
                if (n0Var2.f42028c && n0Var2.f42031r != null) {
                    n0Var2.f42030n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    n0Var2.f42028c = false;
                    n0Var2.d();
                    return;
                }
                return;
        }
    }
}
