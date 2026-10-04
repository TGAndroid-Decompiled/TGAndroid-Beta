package xh;
public final class x2 implements Runnable {
    public final int f50303a;
    public final i4 f50304b;

    public x2(i4 i4Var, int i10) {
        this.f50303a = i10;
        this.f50304b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f50303a) {
            case 0:
                v3 v3Var = this.f50304b.d;
                if (!v3Var.f50281l.isEmpty()) {
                    v3Var.f50281l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f50304b.d;
                if (!v3Var2.f50280k.isEmpty()) {
                    v3Var2.f50280k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f50304b.d;
                if (!v3Var3.f50279j.isEmpty()) {
                    v3Var3.f50279j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50304b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f50304b.d.i(u3.BY_DATE);
                return;
            default:
                this.f50304b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
