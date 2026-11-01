package ph;

import org.telegram.ui.d01;
import rh.e6;
import rh.y7;
public final class w3 implements Runnable {
    public final int f45358a;
    public final g4 f45359b;

    public w3(g4 g4Var, int i10) {
        this.f45358a = i10;
        this.f45359b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f45358a) {
            case 0:
                this.f45359b.f1(false);
                return;
            case 1:
                this.f45359b.f1(true);
                return;
            case 2:
                g4 g4Var = this.f45359b;
                rh.e4 e4Var = new rh.e4(g4Var.getContext(), g4Var.Q1, g4Var.R1, g4Var.I0, null);
                long j10 = g4Var.U1.f20022id;
                String str = g4Var.X1;
                e4Var.f46822f3 = true;
                e6.y(e4Var.f21584a, false).K(j10, new d01(29, e4Var, str));
                return;
            case 3:
                g4 g4Var2 = this.f45359b;
                w.g1(g4Var2.getContext(), g4Var2.U1, g4Var2.I0);
                return;
            case 4:
                g4 g4Var3 = this.f45359b;
                new y7(g4Var3.getContext(), g4Var3.I0).show();
                return;
            default:
                this.f45359b.dismiss();
                return;
        }
    }
}
