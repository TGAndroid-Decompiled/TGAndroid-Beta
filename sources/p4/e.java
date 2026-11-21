package p4;
public final class e implements Runnable {
    public final int f55225a;
    public final e0 f55226b;
    public final v f55227c;

    public e(e0 e0Var, v vVar, int i7) {
        this.f55225a = i7;
        this.f55226b = e0Var;
        this.f55227c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f55225a) {
            case 0:
                e0 e0Var = this.f55226b;
                if (!e0Var.j()) {
                    if (e0Var.f55248x) {
                        v vVar = this.f55227c;
                        if (!e0.k(vVar)) {
                            if (e0Var.i(vVar)) {
                                e0Var.f55248x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    e0Var.f55231e.getClass();
                    return;
                }
                return;
            case 1:
                this.f55226b.f55233g.q1(this.f55227c, Integer.MIN_VALUE, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 2:
                this.f55226b.f55233g.q1(this.f55227c, Integer.MIN_VALUE, 9, e1.s1(new r0(6)));
                return;
            case 3:
                this.f55226b.f55233g.q1(this.f55227c, Integer.MIN_VALUE, 7, e1.s1(new r0(2)));
                return;
            case 4:
                this.f55226b.f55233g.q1(this.f55227c, Integer.MIN_VALUE, 12, e1.s1(new r0(5)));
                return;
            case 5:
                this.f55226b.f55233g.q1(this.f55227c, Integer.MIN_VALUE, 11, e1.s1(new r0(1)));
                return;
            case 6:
                this.f55226b.f55233g.q1(this.f55227c, Integer.MIN_VALUE, 3, e1.s1(new r0(12)));
                return;
            case 7:
                this.f55226b.f55233g.q1(this.f55227c, Integer.MIN_VALUE, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                return;
            case 8:
                this.f55226b.f55233g.o1(this.f55227c, Integer.MIN_VALUE);
                return;
            default:
                this.f55226b.f55233g.o1(this.f55227c, Integer.MIN_VALUE);
                return;
        }
    }
}
