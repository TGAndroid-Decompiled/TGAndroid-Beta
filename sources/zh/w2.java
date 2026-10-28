package zh;
public final class w2 implements Runnable {
    public final int f53372a;
    public final h4 f53373b;

    public w2(h4 h4Var, int i10) {
        this.f53372a = i10;
        this.f53373b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f53372a) {
            case 0:
                u3 u3Var = this.f53373b.d;
                if (!u3Var.f53331l.isEmpty()) {
                    u3Var.f53331l.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f53373b.d;
                if (!u3Var2.f53330k.isEmpty()) {
                    u3Var2.f53330k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f53373b.d;
                if (!u3Var3.f53329j.isEmpty()) {
                    u3Var3.f53329j.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f53373b.d.i(t3.BY_PRICE);
                return;
            case 4:
                this.f53373b.d.i(t3.BY_DATE);
                return;
            default:
                this.f53373b.d.i(t3.BY_NUMBER);
                return;
        }
    }
}
