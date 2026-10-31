package vh;

import org.telegram.ui.Components.wb;
public final class i6 implements Runnable {
    public final int f51282a;
    public final r6 f51283b;

    public i6(r6 r6Var, int i10) {
        this.f51282a = i10;
        this.f51283b = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f51282a) {
            case 0:
                w6 w6Var = this.f51283b.W;
                wb.h(w6Var.f21589c);
                w6.I0(w6Var);
                return;
            case 1:
                r6 r6Var = this.f51283b;
                r6Var.f51893w.setLoading(false);
                w6 w6Var2 = r6Var.W;
                w6Var2.M0();
                w6Var2.f52100i1.E(0);
                return;
            case 2:
                this.f51283b.U = false;
                return;
            case 3:
                w6 w6Var3 = this.f51283b.W;
                w6Var3.D1 = 6;
                w6Var3.f52100i1.E(1);
                return;
            case 4:
                r6 r6Var2 = this.f51283b;
                r6Var2.f51890n.g(2);
                r6Var2.f51889f.forceLayout();
                r6Var2.k();
                return;
            default:
                r6 r6Var3 = this.f51283b;
                w6 w6Var4 = r6Var3.W;
                if (r6Var3.f51886a == 0) {
                    w6Var4.dismiss();
                    return;
                } else {
                    w6Var4.onBackPressed();
                    return;
                }
        }
    }
}
