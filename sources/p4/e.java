package p4;
public final class e implements Runnable {
    public final int f53237a;
    public final d0 f53238b;
    public final v f53239c;

    public e(d0 d0Var, v vVar, int i7) {
        this.f53237a = i7;
        this.f53238b = d0Var;
        this.f53239c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f53237a) {
            case 0:
                d0 d0Var = this.f53238b;
                if (!d0Var.j()) {
                    if (d0Var.f53232x) {
                        v vVar = this.f53239c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.f53232x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    d0Var.f53215e.getClass();
                    return;
                }
                return;
            case 1:
                this.f53238b.f53217g.q1(this.f53239c, Integer.MIN_VALUE, 1, c1.s1(new org.telegram.utils.twidget.e(21)));
                return;
            case 2:
                this.f53238b.f53217g.q1(this.f53239c, Integer.MIN_VALUE, 9, c1.s1(new r0(0)));
                return;
            case 3:
                this.f53238b.f53217g.q1(this.f53239c, Integer.MIN_VALUE, 7, c1.s1(new org.telegram.utils.twidget.e(26)));
                return;
            case 4:
                this.f53238b.f53217g.q1(this.f53239c, Integer.MIN_VALUE, 12, c1.s1(new org.telegram.utils.twidget.e(29)));
                return;
            case 5:
                this.f53238b.f53217g.q1(this.f53239c, Integer.MIN_VALUE, 11, c1.s1(new org.telegram.utils.twidget.e(25)));
                return;
            case 6:
                this.f53238b.f53217g.q1(this.f53239c, Integer.MIN_VALUE, 3, c1.s1(new r0(6)));
                return;
            case 7:
                this.f53238b.f53217g.q1(this.f53239c, Integer.MIN_VALUE, 1, c1.s1(new org.telegram.utils.twidget.e(21)));
                return;
            case 8:
                this.f53238b.f53217g.o1(this.f53239c, Integer.MIN_VALUE);
                return;
            default:
                this.f53238b.f53217g.o1(this.f53239c, Integer.MIN_VALUE);
                return;
        }
    }
}
