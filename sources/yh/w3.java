package yh;
public final class w3 implements Runnable {
    public final int f50648a;
    public final e4 f50649b;

    public w3(e4 e4Var, int i10) {
        this.f50648a = i10;
        this.f50649b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f50648a) {
            case 0:
                t3 t3Var = this.f50649b.f50295c;
                if (!t3Var.f50593j.isEmpty()) {
                    t3Var.f50593j.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f50649b.f50295c;
                if (!t3Var2.f50594k.isEmpty()) {
                    t3Var2.f50594k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f50649b.f50295c;
                if (!t3Var3.f50595l.isEmpty()) {
                    t3Var3.f50595l.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50649b.f50295c.i(s3.BY_PRICE);
                return;
            case 4:
                this.f50649b.f50295c.i(s3.BY_DATE);
                return;
            default:
                this.f50649b.f50295c.i(s3.BY_NUMBER);
                return;
        }
    }
}
