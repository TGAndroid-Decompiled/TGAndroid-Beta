package p4;
public final class e implements Runnable {
    public final int f53134a;
    public final d0 f53135b;
    public final v f53136c;

    public e(d0 d0Var, v vVar, int i7) {
        this.f53134a = i7;
        this.f53135b = d0Var;
        this.f53136c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f53134a) {
            case 0:
                d0 d0Var = this.f53135b;
                if (!d0Var.j()) {
                    if (d0Var.f53129x) {
                        v vVar = this.f53136c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.f53129x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    d0Var.f53112e.getClass();
                    return;
                }
                return;
            case 1:
                this.f53135b.f53114g.Q0(this.f53136c, Integer.MIN_VALUE, 1, c1.S0(new org.telegram.utils.twidget.a(20)));
                return;
            case 2:
                this.f53135b.f53114g.Q0(this.f53136c, Integer.MIN_VALUE, 9, c1.S0(new org.telegram.utils.twidget.a(29)));
                return;
            case 3:
                this.f53135b.f53114g.Q0(this.f53136c, Integer.MIN_VALUE, 7, c1.S0(new org.telegram.utils.twidget.a(25)));
                return;
            case 4:
                this.f53135b.f53114g.Q0(this.f53136c, Integer.MIN_VALUE, 12, c1.S0(new org.telegram.utils.twidget.a(28)));
                return;
            case 5:
                this.f53135b.f53114g.Q0(this.f53136c, Integer.MIN_VALUE, 11, c1.S0(new org.telegram.utils.twidget.a(24)));
                return;
            case 6:
                this.f53135b.f53114g.Q0(this.f53136c, Integer.MIN_VALUE, 3, c1.S0(new r0(5)));
                return;
            case 7:
                this.f53135b.f53114g.Q0(this.f53136c, Integer.MIN_VALUE, 1, c1.S0(new org.telegram.utils.twidget.a(20)));
                return;
            case 8:
                this.f53135b.f53114g.O0(this.f53136c, Integer.MIN_VALUE);
                return;
            default:
                this.f53135b.f53114g.O0(this.f53136c, Integer.MIN_VALUE);
                return;
        }
    }
}
