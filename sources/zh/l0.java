package zh;

import org.telegram.messenger.c20;
public final class l0 implements Runnable {
    public final int f60453a;
    public final g1 f60454b;
    public final c20 f60455c;

    public l0(g1 g1Var, c20 c20Var, int i7) {
        this.f60453a = i7;
        this.f60454b = g1Var;
        this.f60455c = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f60453a) {
            case 0:
                g1 g1Var = this.f60454b;
                c20 c20Var = this.f60455c;
                if (c20Var != null) {
                    g1Var.getClass();
                    c20Var.a(Boolean.FALSE);
                }
                g1Var.dismiss();
                return;
            case 1:
                g1 g1Var2 = this.f60454b;
                c20 c20Var2 = this.f60455c;
                if (c20Var2 != null) {
                    g1Var2.getClass();
                    c20Var2.a(Boolean.FALSE);
                }
                g1Var2.dismiss();
                return;
            default:
                g1 g1Var3 = this.f60454b;
                c20 c20Var3 = this.f60455c;
                if (c20Var3 != null) {
                    g1Var3.getClass();
                    c20Var3.a(Boolean.FALSE);
                }
                g1Var3.dismiss();
                return;
        }
    }
}
