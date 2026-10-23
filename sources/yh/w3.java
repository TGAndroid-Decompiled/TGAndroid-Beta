package yh;
public final class w3 implements Runnable {
    public final int f51034a;
    public final e4 f51035b;

    public w3(e4 e4Var, int i10) {
        this.f51034a = i10;
        this.f51035b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f51034a) {
            case 0:
                s3 s3Var = this.f51035b.f50681c;
                if (!s3Var.f50972j.isEmpty()) {
                    s3Var.f50972j.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f51035b.f50681c;
                if (!s3Var2.f50973k.isEmpty()) {
                    s3Var2.f50973k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f51035b.f50681c;
                if (!s3Var3.f50974l.isEmpty()) {
                    s3Var3.f50974l.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51035b.f50681c.i(r3.BY_PRICE);
                return;
            case 4:
                this.f51035b.f50681c.i(r3.BY_DATE);
                return;
            default:
                this.f51035b.f50681c.i(r3.BY_NUMBER);
                return;
        }
    }
}
