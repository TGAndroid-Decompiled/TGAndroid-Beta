package vh;

import org.telegram.messenger.cd;
public final class h0 implements Runnable {
    public final int f51223a;
    public final n0 f51224b;

    public h0(n0 n0Var, int i10) {
        this.f51223a = i10;
        this.f51224b = n0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f51223a;
        n0 n0Var = this.f51224b;
        switch (i10) {
            case 0:
                n0Var.b();
                return;
            case 1:
                n0Var.e = false;
                k0 k0Var = n0Var.f51495s;
                if (k0Var != null) {
                    k0Var.a(true);
                    n0Var.f51495s = null;
                }
                m0 m0Var = n0Var.f51493n;
                if (m0Var != null) {
                    m0Var.a();
                }
                n0Var.f51491c = false;
                n0Var.d();
                return;
            default:
                if (n0Var.f51491c && n0Var.f51494r != null) {
                    n0Var.f51493n.b(2131624011, 3500, cd.M0("VideoConvertFail"));
                    n0Var.f51491c = false;
                    n0Var.d();
                    return;
                }
                return;
        }
    }
}
