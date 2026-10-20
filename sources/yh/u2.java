package yh;
public final class u2 implements Runnable {
    public final int f50533a;
    public final g4 f50534b;

    public u2(g4 g4Var, int i10) {
        this.f50533a = i10;
        this.f50534b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50533a) {
            case 0:
                s3 s3Var = this.f50534b.d;
                if (!s3Var.f50512l.isEmpty()) {
                    s3Var.f50512l.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f50534b.d;
                if (!s3Var2.f50511k.isEmpty()) {
                    s3Var2.f50511k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f50534b.d;
                if (!s3Var3.f50510j.isEmpty()) {
                    s3Var3.f50510j.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50534b.d.i(r3.BY_PRICE);
                return;
            case 4:
                this.f50534b.d.i(r3.BY_DATE);
                return;
            default:
                this.f50534b.d.i(r3.BY_NUMBER);
                return;
        }
    }
}
