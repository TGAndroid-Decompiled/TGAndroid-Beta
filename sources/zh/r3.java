package zh;

import bi.ea;
import bi.k7;
import bi.uc;
public final class r3 implements Runnable {
    public final int f60431a;
    public final b4 f60432b;

    public r3(b4 b4Var, int i7) {
        this.f60431a = i7;
        this.f60432b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f60431a) {
            case 0:
                this.f60432b.f1(false);
                return;
            case 1:
                this.f60432b.f1(true);
                return;
            case 2:
                b4 b4Var = this.f60432b;
                k7 k7Var = new k7(b4Var.getContext(), b4Var.Q1, b4Var.R1, b4Var.I0, null);
                long j3 = b4Var.U1.f27181id;
                String str = b4Var.X1;
                k7Var.f4174f3 = true;
                ea.y(k7Var.f28612a, false).K(j3, new ai.f1(3, k7Var, str));
                return;
            case 3:
                b4 b4Var2 = this.f60432b;
                v.g1(b4Var2.getContext(), b4Var2.U1, b4Var2.I0);
                return;
            case 4:
                b4 b4Var3 = this.f60432b;
                new uc(b4Var3.getContext(), b4Var3.I0).show();
                return;
            default:
                this.f60432b.dismiss();
                return;
        }
    }
}
