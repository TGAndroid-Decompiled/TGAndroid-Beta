package p4;
public final class e implements Runnable {
    public final int f53108a;
    public final d0 f53109b;
    public final v f53110c;

    public e(d0 d0Var, v vVar, int i7) {
        this.f53108a = i7;
        this.f53109b = d0Var;
        this.f53110c = vVar;
    }

    @Override
    public final void run() {
        switch (this.f53108a) {
            case 0:
                d0 d0Var = this.f53109b;
                if (!d0Var.j()) {
                    if (d0Var.f53103x) {
                        v vVar = this.f53110c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.f53103x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    d0Var.f53086e.getClass();
                    return;
                }
                return;
            case 1:
                this.f53109b.f53088g.Q0(this.f53110c, Integer.MIN_VALUE, 1, c1.S0(new org.telegram.utils.twidget.a(20)));
                return;
            case 2:
                this.f53109b.f53088g.Q0(this.f53110c, Integer.MIN_VALUE, 9, c1.S0(new org.telegram.utils.twidget.a(29)));
                return;
            case 3:
                this.f53109b.f53088g.Q0(this.f53110c, Integer.MIN_VALUE, 7, c1.S0(new org.telegram.utils.twidget.a(25)));
                return;
            case 4:
                this.f53109b.f53088g.Q0(this.f53110c, Integer.MIN_VALUE, 12, c1.S0(new org.telegram.utils.twidget.a(28)));
                return;
            case 5:
                this.f53109b.f53088g.Q0(this.f53110c, Integer.MIN_VALUE, 11, c1.S0(new org.telegram.utils.twidget.a(24)));
                return;
            case 6:
                this.f53109b.f53088g.Q0(this.f53110c, Integer.MIN_VALUE, 3, c1.S0(new r0(5)));
                return;
            case 7:
                this.f53109b.f53088g.Q0(this.f53110c, Integer.MIN_VALUE, 1, c1.S0(new org.telegram.utils.twidget.a(20)));
                return;
            case 8:
                this.f53109b.f53088g.O0(this.f53110c, Integer.MIN_VALUE);
                return;
            default:
                this.f53109b.f53088g.O0(this.f53110c, Integer.MIN_VALUE);
                return;
        }
    }
}
