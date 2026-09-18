package xh;
public final class y3 implements Runnable {
    public final int f46466a;
    public final g4 f46467b;

    public y3(g4 g4Var, int i10) {
        this.f46466a = i10;
        this.f46467b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46466a) {
            case 0:
                v3 v3Var = this.f46467b.f46132c;
                if (!v3Var.f46429j.isEmpty()) {
                    v3Var.f46429j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46467b.f46132c;
                if (!v3Var2.f46430k.isEmpty()) {
                    v3Var2.f46430k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46467b.f46132c;
                if (!v3Var3.f46431l.isEmpty()) {
                    v3Var3.f46431l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46467b.f46132c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46467b.f46132c.i(u3.BY_DATE);
                return;
            default:
                this.f46467b.f46132c.i(u3.BY_NUMBER);
                return;
        }
    }
}
