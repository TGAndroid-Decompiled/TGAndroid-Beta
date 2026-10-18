package yh;
public final class w3 implements Runnable {
    public final int f50567a;
    public final e4 f50568b;

    public w3(e4 e4Var, int i10) {
        this.f50567a = i10;
        this.f50568b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f50567a) {
            case 0:
                s3 s3Var = this.f50568b.f50227c;
                if (!s3Var.f50504j.isEmpty()) {
                    s3Var.f50504j.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f50568b.f50227c;
                if (!s3Var2.f50505k.isEmpty()) {
                    s3Var2.f50505k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f50568b.f50227c;
                if (!s3Var3.f50506l.isEmpty()) {
                    s3Var3.f50506l.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50568b.f50227c.i(r3.BY_PRICE);
                return;
            case 4:
                this.f50568b.f50227c.i(r3.BY_DATE);
                return;
            default:
                this.f50568b.f50227c.i(r3.BY_NUMBER);
                return;
        }
    }
}
