package zh;

import org.telegram.messenger.c20;
public final class l0 implements Runnable {
    public final int f60329a;
    public final h1 f60330b;
    public final c20 f60331c;

    public l0(h1 h1Var, c20 c20Var, int i7) {
        this.f60329a = i7;
        this.f60330b = h1Var;
        this.f60331c = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f60329a) {
            case 0:
                h1 h1Var = this.f60330b;
                c20 c20Var = this.f60331c;
                if (c20Var != null) {
                    h1Var.getClass();
                    c20Var.a(Boolean.FALSE);
                }
                h1Var.dismiss();
                return;
            case 1:
                h1 h1Var2 = this.f60330b;
                c20 c20Var2 = this.f60331c;
                if (c20Var2 != null) {
                    h1Var2.getClass();
                    c20Var2.a(Boolean.FALSE);
                }
                h1Var2.dismiss();
                return;
            default:
                h1 h1Var3 = this.f60330b;
                c20 c20Var3 = this.f60331c;
                if (c20Var3 != null) {
                    h1Var3.getClass();
                    c20Var3.a(Boolean.FALSE);
                }
                h1Var3.dismiss();
                return;
        }
    }
}
