package vh;

import org.telegram.messenger.dd;
public final class h0 implements Runnable {
    public final int f51238a;
    public final n0 f51239b;

    public h0(n0 n0Var, int i10) {
        this.f51238a = i10;
        this.f51239b = n0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f51238a;
        n0 n0Var = this.f51239b;
        switch (i10) {
            case 0:
                n0Var.b();
                return;
            case 1:
                n0Var.e = false;
                k0 k0Var = n0Var.f51510s;
                if (k0Var != null) {
                    k0Var.a(true);
                    n0Var.f51510s = null;
                }
                m0 m0Var = n0Var.f51508n;
                if (m0Var != null) {
                    m0Var.a();
                }
                n0Var.f51506c = false;
                n0Var.d();
                return;
            default:
                if (n0Var.f51506c && n0Var.f51509r != null) {
                    n0Var.f51508n.b(2131624011, 3500, dd.M0("VideoConvertFail"));
                    n0Var.f51506c = false;
                    n0Var.d();
                    return;
                }
                return;
        }
    }
}
