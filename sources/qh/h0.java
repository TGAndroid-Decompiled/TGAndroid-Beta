package qh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h0 implements Runnable {
    public final int f45381a;
    public final n0 f45382b;

    public h0(n0 n0Var, int i10) {
        this.f45381a = i10;
        this.f45382b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f45381a) {
            case 0:
                this.f45382b.b();
                return;
            case 1:
                n0 n0Var = this.f45382b;
                n0Var.f45785e = false;
                k0 k0Var = n0Var.f45789s;
                if (k0Var != null) {
                    k0Var.a(true);
                    n0Var.f45789s = null;
                }
                m0 m0Var = n0Var.f45787n;
                if (m0Var != null) {
                    m0Var.a();
                }
                n0Var.f45784c = false;
                n0Var.d();
                return;
            default:
                n0 n0Var2 = this.f45382b;
                if (n0Var2.f45784c && n0Var2.f45788r != null) {
                    n0Var2.f45787n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    n0Var2.f45784c = false;
                    n0Var2.d();
                    return;
                }
                return;
        }
    }
}
