package yh;
public final class v2 implements Runnable {
    public final int f49158a;
    public final g4 f49159b;

    public v2(g4 g4Var, int i10) {
        this.f49158a = i10;
        this.f49159b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f49158a) {
            case 0:
                t3 t3Var = this.f49159b.d;
                if (!t3Var.f49136l.isEmpty()) {
                    t3Var.f49136l.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f49159b.d;
                if (!t3Var2.f49135k.isEmpty()) {
                    t3Var2.f49135k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f49159b.d;
                if (!t3Var3.f49134j.isEmpty()) {
                    t3Var3.f49134j.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f49159b.d.i(s3.BY_PRICE);
                return;
            case 4:
                this.f49159b.d.i(s3.BY_DATE);
                return;
            default:
                this.f49159b.d.i(s3.BY_NUMBER);
                return;
        }
    }
}
