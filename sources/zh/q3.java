package zh;

import bi.ea;
import bi.k7;
import bi.uc;
public final class q3 implements Runnable {
    public final int f60510a;
    public final a4 f60511b;

    public q3(a4 a4Var, int i7) {
        this.f60510a = i7;
        this.f60511b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f60510a) {
            case 0:
                this.f60511b.f1(false);
                return;
            case 1:
                this.f60511b.f1(true);
                return;
            case 2:
                a4 a4Var = this.f60511b;
                k7 k7Var = new k7(a4Var.getContext(), a4Var.Q1, a4Var.R1, a4Var.I0, null);
                long j3 = a4Var.U1.f27185id;
                String str = a4Var.X1;
                k7Var.f4174f3 = true;
                ea.y(k7Var.f28616a, false).K(j3, new ai.f1(3, k7Var, str));
                return;
            case 3:
                a4 a4Var2 = this.f60511b;
                u.g1(a4Var2.getContext(), a4Var2.U1, a4Var2.I0);
                return;
            case 4:
                a4 a4Var3 = this.f60511b;
                new uc(a4Var3.getContext(), a4Var3.I0).show();
                return;
            default:
                this.f60511b.dismiss();
                return;
        }
    }
}
