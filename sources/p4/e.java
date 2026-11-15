package p4;
public final class e implements Runnable {
    public final int f54643a;
    public final d0 f54644b;
    public final v f54645c;

    public e(d0 d0Var, v vVar, int i7) {
        this.f54643a = i7;
        this.f54644b = d0Var;
        this.f54645c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f54643a) {
            case 0:
                d0 d0Var = this.f54644b;
                if (!d0Var.j()) {
                    if (d0Var.f54638x) {
                        v vVar = this.f54645c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.f54638x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    d0Var.f54621e.getClass();
                    return;
                }
                return;
            case 1:
                this.f54644b.f54623g.q1(this.f54645c, Integer.MIN_VALUE, 1, c1.s1(new org.telegram.utils.twidget.e(26)));
                return;
            case 2:
                this.f54644b.f54623g.q1(this.f54645c, Integer.MIN_VALUE, 9, c1.s1(new q0(5)));
                return;
            case 3:
                this.f54644b.f54623g.q1(this.f54645c, Integer.MIN_VALUE, 7, c1.s1(new q0(1)));
                return;
            case 4:
                this.f54644b.f54623g.q1(this.f54645c, Integer.MIN_VALUE, 12, c1.s1(new q0(4)));
                return;
            case 5:
                this.f54644b.f54623g.q1(this.f54645c, Integer.MIN_VALUE, 11, c1.s1(new q0(0)));
                return;
            case 6:
                this.f54644b.f54623g.q1(this.f54645c, Integer.MIN_VALUE, 3, c1.s1(new q0(11)));
                return;
            case 7:
                this.f54644b.f54623g.q1(this.f54645c, Integer.MIN_VALUE, 1, c1.s1(new org.telegram.utils.twidget.e(26)));
                return;
            case 8:
                this.f54644b.f54623g.o1(this.f54645c, Integer.MIN_VALUE);
                return;
            default:
                this.f54644b.f54623g.o1(this.f54645c, Integer.MIN_VALUE);
                return;
        }
    }
}
