package xh;
public final class x2 implements Runnable {
    public final int f46466a;
    public final i4 f46467b;

    public x2(i4 i4Var, int i10) {
        this.f46466a = i10;
        this.f46467b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f46466a) {
            case 0:
                v3 v3Var = this.f46467b.d;
                if (!v3Var.f46444l.isEmpty()) {
                    v3Var.f46444l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46467b.d;
                if (!v3Var2.f46443k.isEmpty()) {
                    v3Var2.f46443k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46467b.d;
                if (!v3Var3.f46442j.isEmpty()) {
                    v3Var3.f46442j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46467b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46467b.d.i(u3.BY_DATE);
                return;
            default:
                this.f46467b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
