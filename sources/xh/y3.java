package xh;
public final class y3 implements Runnable {
    public final int f51614a;
    public final g4 f51615b;

    public y3(g4 g4Var, int i10) {
        this.f51614a = i10;
        this.f51615b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f51614a) {
            case 0:
                v3 v3Var = this.f51615b.f51256c;
                if (!v3Var.f51559j.isEmpty()) {
                    v3Var.f51559j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f51615b.f51256c;
                if (!v3Var2.f51560k.isEmpty()) {
                    v3Var2.f51560k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f51615b.f51256c;
                if (!v3Var3.f51561l.isEmpty()) {
                    v3Var3.f51561l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51615b.f51256c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f51615b.f51256c.i(u3.BY_DATE);
                return;
            default:
                this.f51615b.f51256c.i(u3.BY_NUMBER);
                return;
        }
    }
}
