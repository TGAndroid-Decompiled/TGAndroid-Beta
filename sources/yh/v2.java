package yh;
public final class v2 implements Runnable {
    public final int f49159a;
    public final g4 f49160b;

    public v2(g4 g4Var, int i10) {
        this.f49159a = i10;
        this.f49160b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f49159a) {
            case 0:
                t3 t3Var = this.f49160b.d;
                if (!t3Var.f49137l.isEmpty()) {
                    t3Var.f49137l.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f49160b.d;
                if (!t3Var2.f49136k.isEmpty()) {
                    t3Var2.f49136k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f49160b.d;
                if (!t3Var3.f49135j.isEmpty()) {
                    t3Var3.f49135j.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f49160b.d.i(s3.BY_PRICE);
                return;
            case 4:
                this.f49160b.d.i(s3.BY_DATE);
                return;
            default:
                this.f49160b.d.i(s3.BY_NUMBER);
                return;
        }
    }
}
