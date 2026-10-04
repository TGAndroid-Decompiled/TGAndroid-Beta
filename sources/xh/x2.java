package xh;
public final class x2 implements Runnable {
    public final int f50304a;
    public final i4 f50305b;

    public x2(i4 i4Var, int i10) {
        this.f50304a = i10;
        this.f50305b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f50304a) {
            case 0:
                v3 v3Var = this.f50305b.d;
                if (!v3Var.f50282l.isEmpty()) {
                    v3Var.f50282l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f50305b.d;
                if (!v3Var2.f50281k.isEmpty()) {
                    v3Var2.f50281k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f50305b.d;
                if (!v3Var3.f50280j.isEmpty()) {
                    v3Var3.f50280j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50305b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f50305b.d.i(u3.BY_DATE);
                return;
            default:
                this.f50305b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
