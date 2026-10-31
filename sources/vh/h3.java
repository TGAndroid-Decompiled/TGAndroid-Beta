package vh;

import java.util.List;
public final class h3 implements Runnable {
    public final int f51242a;
    public final b4 f51243b;

    public h3(b4 b4Var, int i10) {
        this.f51242a = i10;
        this.f51243b = b4Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f51242a) {
            case 0:
                jg.d2 d2Var = this.f51243b.M0;
                if (d2Var != null) {
                    d2Var.invalidate();
                    return;
                }
                return;
            case 1:
                new kg.i1((org.telegram.ui.ActionBar.k2) new kg.q1(this.f51243b, 13), 14, true).show();
                return;
            case 2:
                this.f51243b.w0(false);
                return;
            default:
                b4 b4Var = this.f51243b;
                boolean z10 = ig.s0.e(b4Var.f50979o1).f8458k;
                int i10 = 0;
                while (true) {
                    List list = ig.g.f8308c;
                    if (i10 < list.size()) {
                        ig.g gVar = (ig.g) list.get(i10);
                        if (z10) {
                            e = gVar.m();
                        } else {
                            e = gVar.e();
                        }
                        String n10 = gVar.n();
                        org.telegram.ui.Wallet.x0 x0Var = new org.telegram.ui.Wallet.x0(b4Var, gVar, e, 21);
                        z3 z3Var = new z3(b4Var, b4Var.getContext());
                        z3Var.setIcon(e);
                        z3Var.setText(n10);
                        z3Var.setSelected(false);
                        z3Var.setOnClickListener(new rh.s(x0Var, 20));
                        z3Var.setOnLongClickListener(new bi.h1(b4Var, 5));
                        b4Var.f50985r1.a(z3Var, w7.b6.o(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
