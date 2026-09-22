package xh;
public final class x2 implements Runnable {
    public final int f46521a;
    public final i4 f46522b;

    public x2(i4 i4Var, int i10) {
        this.f46521a = i10;
        this.f46522b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f46521a) {
            case 0:
                v3 v3Var = this.f46522b.d;
                if (!v3Var.f46499l.isEmpty()) {
                    v3Var.f46499l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46522b.d;
                if (!v3Var2.f46498k.isEmpty()) {
                    v3Var2.f46498k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46522b.d;
                if (!v3Var3.f46497j.isEmpty()) {
                    v3Var3.f46497j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46522b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46522b.d.i(u3.BY_DATE);
                return;
            default:
                this.f46522b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
