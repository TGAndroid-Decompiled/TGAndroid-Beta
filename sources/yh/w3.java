package yh;
public final class w3 implements Runnable {
    public final int f51033a;
    public final e4 f51034b;

    public w3(e4 e4Var, int i10) {
        this.f51033a = i10;
        this.f51034b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f51033a) {
            case 0:
                s3 s3Var = this.f51034b.f50680c;
                if (!s3Var.f50971j.isEmpty()) {
                    s3Var.f50971j.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f51034b.f50680c;
                if (!s3Var2.f50972k.isEmpty()) {
                    s3Var2.f50972k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f51034b.f50680c;
                if (!s3Var3.f50973l.isEmpty()) {
                    s3Var3.f50973l.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51034b.f50680c.i(r3.BY_PRICE);
                return;
            case 4:
                this.f51034b.f50680c.i(r3.BY_DATE);
                return;
            default:
                this.f51034b.f50680c.i(r3.BY_NUMBER);
                return;
        }
    }
}
