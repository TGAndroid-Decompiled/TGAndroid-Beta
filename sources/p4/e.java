package p4;
public final class e implements Runnable {
    public final int f55229a;
    public final e0 f55230b;
    public final v f55231c;

    public e(e0 e0Var, v vVar, int i7) {
        this.f55229a = i7;
        this.f55230b = e0Var;
        this.f55231c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f55229a) {
            case 0:
                e0 e0Var = this.f55230b;
                if (!e0Var.j()) {
                    if (e0Var.f55252x) {
                        v vVar = this.f55231c;
                        if (!e0.k(vVar)) {
                            if (e0Var.i(vVar)) {
                                e0Var.f55252x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    e0Var.f55235e.getClass();
                    return;
                }
                return;
            case 1:
                this.f55230b.f55237g.q1(this.f55231c, Integer.MIN_VALUE, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 2:
                this.f55230b.f55237g.q1(this.f55231c, Integer.MIN_VALUE, 9, e1.s1(new r0(6)));
                return;
            case 3:
                this.f55230b.f55237g.q1(this.f55231c, Integer.MIN_VALUE, 7, e1.s1(new r0(2)));
                return;
            case 4:
                this.f55230b.f55237g.q1(this.f55231c, Integer.MIN_VALUE, 12, e1.s1(new r0(5)));
                return;
            case 5:
                this.f55230b.f55237g.q1(this.f55231c, Integer.MIN_VALUE, 11, e1.s1(new r0(1)));
                return;
            case 6:
                this.f55230b.f55237g.q1(this.f55231c, Integer.MIN_VALUE, 3, e1.s1(new r0(12)));
                return;
            case 7:
                this.f55230b.f55237g.q1(this.f55231c, Integer.MIN_VALUE, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 8:
                this.f55230b.f55237g.o1(this.f55231c, Integer.MIN_VALUE);
                return;
            default:
                this.f55230b.f55237g.o1(this.f55231c, Integer.MIN_VALUE);
                return;
        }
    }
}
