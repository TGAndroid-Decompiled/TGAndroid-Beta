package xh;
public final class x2 implements Runnable {
    public final int f46152a;
    public final i4 f46153b;

    public x2(i4 i4Var, int i10) {
        this.f46152a = i10;
        this.f46153b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f46152a) {
            case 0:
                v3 v3Var = this.f46153b.d;
                if (!v3Var.f46130l.isEmpty()) {
                    v3Var.f46130l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46153b.d;
                if (!v3Var2.f46129k.isEmpty()) {
                    v3Var2.f46129k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46153b.d;
                if (!v3Var3.f46128j.isEmpty()) {
                    v3Var3.f46128j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46153b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46153b.d.i(u3.BY_DATE);
                return;
            default:
                this.f46153b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
