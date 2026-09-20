package xh;
public final class y3 implements Runnable {
    public final int f46513a;
    public final g4 f46514b;

    public y3(g4 g4Var, int i10) {
        this.f46513a = i10;
        this.f46514b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46513a) {
            case 0:
                v3 v3Var = this.f46514b.f46179c;
                if (!v3Var.f46476j.isEmpty()) {
                    v3Var.f46476j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46514b.f46179c;
                if (!v3Var2.f46477k.isEmpty()) {
                    v3Var2.f46477k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46514b.f46179c;
                if (!v3Var3.f46478l.isEmpty()) {
                    v3Var3.f46478l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46514b.f46179c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46514b.f46179c.i(u3.BY_DATE);
                return;
            default:
                this.f46514b.f46179c.i(u3.BY_NUMBER);
                return;
        }
    }
}
