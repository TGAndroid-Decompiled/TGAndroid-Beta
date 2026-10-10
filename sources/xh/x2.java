package xh;
public final class x2 implements Runnable {
    public final int f51643a;
    public final i4 f51644b;

    public x2(i4 i4Var, int i10) {
        this.f51643a = i10;
        this.f51644b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f51643a) {
            case 0:
                v3 v3Var = this.f51644b.d;
                if (!v3Var.f51605l.isEmpty()) {
                    v3Var.f51605l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f51644b.d;
                if (!v3Var2.f51604k.isEmpty()) {
                    v3Var2.f51604k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f51644b.d;
                if (!v3Var3.f51603j.isEmpty()) {
                    v3Var3.f51603j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51644b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f51644b.d.i(u3.BY_DATE);
                return;
            default:
                this.f51644b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}
