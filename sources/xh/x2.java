package xh;
public final class x2 implements Runnable {
    public final int f46481a;
    public final i4 f46482b;

    public x2(i4 i4Var, int i10) {
        this.f46481a = i10;
        this.f46482b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f46481a) {
            case 0:
                v3 v3Var = this.f46482b.d;
                if (!v3Var.f46459l.isEmpty()) {
                    v3Var.f46459l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46482b.d;
                if (!v3Var2.f46458k.isEmpty()) {
                    v3Var2.f46458k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46482b.d;
                if (!v3Var3.f46457j.isEmpty()) {
                    v3Var3.f46457j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46482b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46482b.d.i(u3.BY_DATE);
                return;
            default:
                this.f46482b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
