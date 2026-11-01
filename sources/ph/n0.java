package ph;

import org.telegram.messenger.r20;
public final class n0 implements Runnable {
    public final int f45254a;
    public final l1 f45255b;
    public final r20 f45256c;

    public n0(l1 l1Var, r20 r20Var, int i10) {
        this.f45254a = i10;
        this.f45255b = l1Var;
        this.f45256c = r20Var;
    }

    @Override
    public final void run() {
        switch (this.f45254a) {
            case 0:
                l1 l1Var = this.f45255b;
                r20 r20Var = this.f45256c;
                if (r20Var != null) {
                    l1Var.getClass();
                    r20Var.a(Boolean.FALSE);
                }
                l1Var.dismiss();
                return;
            case 1:
                l1 l1Var2 = this.f45255b;
                r20 r20Var2 = this.f45256c;
                if (r20Var2 != null) {
                    l1Var2.getClass();
                    r20Var2.a(Boolean.FALSE);
                }
                l1Var2.dismiss();
                return;
            default:
                l1 l1Var3 = this.f45255b;
                r20 r20Var3 = this.f45256c;
                if (r20Var3 != null) {
                    l1Var3.getClass();
                    r20Var3.a(Boolean.FALSE);
                }
                l1Var3.dismiss();
                return;
        }
    }
}
