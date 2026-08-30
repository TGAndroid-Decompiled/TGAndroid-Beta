package ph;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h0 implements Runnable {
    public final int f41703a;
    public final n0 f41704b;

    public h0(n0 n0Var, int i10) {
        this.f41703a = i10;
        this.f41704b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f41703a) {
            case 0:
                this.f41704b.b();
                return;
            case 1:
                n0 n0Var = this.f41704b;
                n0Var.e = false;
                k0 k0Var = n0Var.f41993s;
                if (k0Var != null) {
                    k0Var.a(true);
                    n0Var.f41993s = null;
                }
                m0 m0Var = n0Var.f41991n;
                if (m0Var != null) {
                    m0Var.a();
                }
                n0Var.f41989c = false;
                n0Var.d();
                return;
            default:
                n0 n0Var2 = this.f41704b;
                if (n0Var2.f41989c && n0Var2.f41992r != null) {
                    n0Var2.f41991n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    n0Var2.f41989c = false;
                    n0Var2.d();
                    return;
                }
                return;
        }
    }
}
