package p4;
public final class e implements Runnable {
    public final int f55214a;
    public final d0 f55215b;
    public final v f55216c;

    public e(d0 d0Var, v vVar, int i7) {
        this.f55214a = i7;
        this.f55215b = d0Var;
        this.f55216c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f55214a) {
            case 0:
                d0 d0Var = this.f55215b;
                if (!d0Var.j()) {
                    if (d0Var.f55208x) {
                        v vVar = this.f55216c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.f55208x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    d0Var.f55191e.getClass();
                    return;
                }
                return;
            case 1:
                this.f55215b.f55193g.q1(this.f55216c, Integer.MIN_VALUE, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 2:
                this.f55215b.f55193g.q1(this.f55216c, Integer.MIN_VALUE, 9, e1.s1(new r0(6)));
                return;
            case 3:
                this.f55215b.f55193g.q1(this.f55216c, Integer.MIN_VALUE, 7, e1.s1(new r0(2)));
                return;
            case 4:
                this.f55215b.f55193g.q1(this.f55216c, Integer.MIN_VALUE, 12, e1.s1(new r0(5)));
                return;
            case 5:
                this.f55215b.f55193g.q1(this.f55216c, Integer.MIN_VALUE, 11, e1.s1(new r0(1)));
                return;
            case 6:
                this.f55215b.f55193g.q1(this.f55216c, Integer.MIN_VALUE, 3, e1.s1(new r0(12)));
                return;
            case 7:
                this.f55215b.f55193g.q1(this.f55216c, Integer.MIN_VALUE, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 8:
                this.f55215b.f55193g.o1(this.f55216c, Integer.MIN_VALUE);
                return;
            default:
                this.f55215b.f55193g.o1(this.f55216c, Integer.MIN_VALUE);
                return;
        }
    }
}
