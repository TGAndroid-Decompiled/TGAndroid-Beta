package xh;
public final class x2 implements Runnable {
    public final int f46482a;
    public final i4 f46483b;

    public x2(i4 i4Var, int i10) {
        this.f46482a = i10;
        this.f46483b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f46482a) {
            case 0:
                v3 v3Var = this.f46483b.d;
                if (!v3Var.f46460l.isEmpty()) {
                    v3Var.f46460l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46483b.d;
                if (!v3Var2.f46459k.isEmpty()) {
                    v3Var2.f46459k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46483b.d;
                if (!v3Var3.f46458j.isEmpty()) {
                    v3Var3.f46458j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46483b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46483b.d.i(u3.BY_DATE);
                return;
            default:
                this.f46483b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
