package xh;
public final class y3 implements Runnable {
    public final int f46165a;
    public final g4 f46166b;

    public y3(g4 g4Var, int i10) {
        this.f46165a = i10;
        this.f46166b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46165a) {
            case 0:
                v3 v3Var = this.f46166b.f45831c;
                if (!v3Var.f46128j.isEmpty()) {
                    v3Var.f46128j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46166b.f45831c;
                if (!v3Var2.f46129k.isEmpty()) {
                    v3Var2.f46129k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46166b.f45831c;
                if (!v3Var3.f46130l.isEmpty()) {
                    v3Var3.f46130l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46166b.f45831c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46166b.f45831c.i(u3.BY_DATE);
                return;
            default:
                this.f46166b.f45831c.i(u3.BY_NUMBER);
                return;
        }
    }
}
