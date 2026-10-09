package xh;
public final class x2 implements Runnable {
    public final int f51599a;
    public final i4 f51600b;

    public x2(i4 i4Var, int i10) {
        this.f51599a = i10;
        this.f51600b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f51599a) {
            case 0:
                v3 v3Var = this.f51600b.d;
                if (!v3Var.f51561l.isEmpty()) {
                    v3Var.f51561l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f51600b.d;
                if (!v3Var2.f51560k.isEmpty()) {
                    v3Var2.f51560k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f51600b.d;
                if (!v3Var3.f51559j.isEmpty()) {
                    v3Var3.f51559j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51600b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f51600b.d.i(u3.BY_DATE);
                return;
            default:
                this.f51600b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
