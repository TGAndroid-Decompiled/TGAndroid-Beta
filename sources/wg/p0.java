package wg;
public final class p0 implements Runnable {
    public final int f59226a;
    public final u0 f59227b;

    public p0(u0 u0Var, int i7) {
        this.f59226a = i7;
        this.f59227b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f59226a) {
            case 0:
                this.f59227b.i1(true);
                return;
            case 1:
                this.f59227b.n1(true, false);
                return;
            case 2:
                this.f59227b.e1();
                return;
            case 3:
                this.f59227b.n1(true, false);
                return;
            case 4:
                this.f59227b.n1(true, false);
                return;
            case 5:
                this.f59227b.n1(true, false);
                return;
            case 6:
                u0 u0Var = this.f59227b;
                u0Var.f59243a2.clear();
                u0Var.f59244b2.clear();
                u0Var.dismiss();
                return;
            default:
                this.f59227b.dismiss();
                return;
        }
    }
}
