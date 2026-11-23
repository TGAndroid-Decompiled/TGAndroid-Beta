package p4;
public final class e implements Runnable {
    public final int f55336a;
    public final d0 f55337b;
    public final v f55338c;

    public e(d0 d0Var, v vVar, int i7) {
        this.f55336a = i7;
        this.f55337b = d0Var;
        this.f55338c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f55336a) {
            case 0:
                d0 d0Var = this.f55337b;
                if (!d0Var.j()) {
                    if (d0Var.f55327x) {
                        v vVar = this.f55338c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.f55327x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    d0Var.f55310e.getClass();
                    return;
                }
                return;
            case 1:
                this.f55337b.f55312g.q1(this.f55338c, Integer.MIN_VALUE, 1, d1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 2:
                this.f55337b.f55312g.q1(this.f55338c, Integer.MIN_VALUE, 9, d1.s1(new r0(6)));
                return;
            case 3:
                this.f55337b.f55312g.q1(this.f55338c, Integer.MIN_VALUE, 7, d1.s1(new r0(2)));
                return;
            case 4:
                this.f55337b.f55312g.q1(this.f55338c, Integer.MIN_VALUE, 12, d1.s1(new r0(5)));
                return;
            case 5:
                this.f55337b.f55312g.q1(this.f55338c, Integer.MIN_VALUE, 11, d1.s1(new r0(1)));
                return;
            case 6:
                this.f55337b.f55312g.q1(this.f55338c, Integer.MIN_VALUE, 3, d1.s1(new r0(12)));
                return;
            case 7:
                this.f55337b.f55312g.q1(this.f55338c, Integer.MIN_VALUE, 1, d1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 8:
                this.f55337b.f55312g.o1(this.f55338c, Integer.MIN_VALUE);
                return;
            default:
                this.f55337b.f55312g.o1(this.f55338c, Integer.MIN_VALUE);
                return;
        }
    }
}
