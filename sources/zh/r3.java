package zh;

import bi.ea;
import bi.k7;
import bi.uc;
public final class r3 implements Runnable {
    public final int f60539a;
    public final b4 f60540b;

    public r3(b4 b4Var, int i7) {
        this.f60539a = i7;
        this.f60540b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f60539a) {
            case 0:
                this.f60540b.f1(false);
                return;
            case 1:
                this.f60540b.f1(true);
                return;
            case 2:
                b4 b4Var = this.f60540b;
                k7 k7Var = new k7(b4Var.getContext(), b4Var.T1, b4Var.U1, b4Var.I0, null);
                long j3 = b4Var.X1.f27189id;
                String str = b4Var.f60230a2;
                k7Var.f4177i3 = true;
                ea.y(k7Var.f28669a, false).K(j3, new ai.f1(3, k7Var, str));
                return;
            case 3:
                b4 b4Var2 = this.f60540b;
                u.g1(b4Var2.getContext(), b4Var2.X1, b4Var2.I0);
                return;
            case 4:
                b4 b4Var3 = this.f60540b;
                new uc(b4Var3.getContext(), b4Var3.I0).show();
                return;
            default:
                this.f60540b.dismiss();
                return;
        }
    }
}
