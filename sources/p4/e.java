package p4;
public final class e implements Runnable {
    public final int f53225a;
    public final d0 f53226b;
    public final v f53227c;

    public e(d0 d0Var, v vVar, int i7) {
        this.f53225a = i7;
        this.f53226b = d0Var;
        this.f53227c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f53225a) {
            case 0:
                d0 d0Var = this.f53226b;
                if (!d0Var.j()) {
                    if (d0Var.f53220x) {
                        v vVar = this.f53227c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.f53220x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    d0Var.f53203e.getClass();
                    return;
                }
                return;
            case 1:
                this.f53226b.f53205g.q1(this.f53227c, Integer.MIN_VALUE, 1, c1.s1(new org.telegram.utils.twidget.e(21)));
                return;
            case 2:
                this.f53226b.f53205g.q1(this.f53227c, Integer.MIN_VALUE, 9, c1.s1(new r0(0)));
                return;
            case 3:
                this.f53226b.f53205g.q1(this.f53227c, Integer.MIN_VALUE, 7, c1.s1(new org.telegram.utils.twidget.e(26)));
                return;
            case 4:
                this.f53226b.f53205g.q1(this.f53227c, Integer.MIN_VALUE, 12, c1.s1(new org.telegram.utils.twidget.e(29)));
                return;
            case 5:
                this.f53226b.f53205g.q1(this.f53227c, Integer.MIN_VALUE, 11, c1.s1(new org.telegram.utils.twidget.e(25)));
                return;
            case 6:
                this.f53226b.f53205g.q1(this.f53227c, Integer.MIN_VALUE, 3, c1.s1(new r0(6)));
                return;
            case 7:
                this.f53226b.f53205g.q1(this.f53227c, Integer.MIN_VALUE, 1, c1.s1(new org.telegram.utils.twidget.e(21)));
                return;
            case 8:
                this.f53226b.f53205g.o1(this.f53227c, Integer.MIN_VALUE);
                return;
            default:
                this.f53226b.f53205g.o1(this.f53227c, Integer.MIN_VALUE);
                return;
        }
    }
}
