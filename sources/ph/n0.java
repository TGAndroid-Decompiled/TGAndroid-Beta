package ph;

import org.telegram.messenger.q20;
public final class n0 implements Runnable {
    public final int f45243a;
    public final l1 f45244b;
    public final q20 f45245c;

    public n0(l1 l1Var, q20 q20Var, int i10) {
        this.f45243a = i10;
        this.f45244b = l1Var;
        this.f45245c = q20Var;
    }

    @Override
    public final void run() {
        switch (this.f45243a) {
            case 0:
                l1 l1Var = this.f45244b;
                q20 q20Var = this.f45245c;
                if (q20Var != null) {
                    l1Var.getClass();
                    q20Var.a(Boolean.FALSE);
                }
                l1Var.dismiss();
                return;
            case 1:
                l1 l1Var2 = this.f45244b;
                q20 q20Var2 = this.f45245c;
                if (q20Var2 != null) {
                    l1Var2.getClass();
                    q20Var2.a(Boolean.FALSE);
                }
                l1Var2.dismiss();
                return;
            default:
                l1 l1Var3 = this.f45244b;
                q20 q20Var3 = this.f45245c;
                if (q20Var3 != null) {
                    l1Var3.getClass();
                    q20Var3.a(Boolean.FALSE);
                }
                l1Var3.dismiss();
                return;
        }
    }
}
