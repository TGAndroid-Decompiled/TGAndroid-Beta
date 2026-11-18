package p4;
public final class e implements Runnable {
    public final int f55204a;
    public final d0 f55205b;
    public final v f55206c;

    public e(d0 d0Var, v vVar, int i7) {
        this.f55204a = i7;
        this.f55205b = d0Var;
        this.f55206c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f55204a) {
            case 0:
                d0 d0Var = this.f55205b;
                if (!d0Var.j()) {
                    if (d0Var.f55198x) {
                        v vVar = this.f55206c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.f55198x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    d0Var.f55181e.getClass();
                    return;
                }
                return;
            case 1:
                this.f55205b.f55183g.q1(this.f55206c, Integer.MIN_VALUE, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 2:
                this.f55205b.f55183g.q1(this.f55206c, Integer.MIN_VALUE, 9, e1.s1(new r0(6)));
                return;
            case 3:
                this.f55205b.f55183g.q1(this.f55206c, Integer.MIN_VALUE, 7, e1.s1(new r0(2)));
                return;
            case 4:
                this.f55205b.f55183g.q1(this.f55206c, Integer.MIN_VALUE, 12, e1.s1(new r0(5)));
                return;
            case 5:
                this.f55205b.f55183g.q1(this.f55206c, Integer.MIN_VALUE, 11, e1.s1(new r0(1)));
                return;
            case 6:
                this.f55205b.f55183g.q1(this.f55206c, Integer.MIN_VALUE, 3, e1.s1(new r0(12)));
                return;
            case 7:
                this.f55205b.f55183g.q1(this.f55206c, Integer.MIN_VALUE, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 8:
                this.f55205b.f55183g.o1(this.f55206c, Integer.MIN_VALUE);
                return;
            default:
                this.f55205b.f55183g.o1(this.f55206c, Integer.MIN_VALUE);
                return;
        }
    }
}
