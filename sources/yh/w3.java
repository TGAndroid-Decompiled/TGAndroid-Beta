package yh;
public final class w3 implements Runnable {
    public final int f49186a;
    public final e4 f49187b;

    public w3(e4 e4Var, int i10) {
        this.f49186a = i10;
        this.f49187b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f49186a) {
            case 0:
                t3 t3Var = this.f49187b.f48850c;
                if (!t3Var.f49134j.isEmpty()) {
                    t3Var.f49134j.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f49187b.f48850c;
                if (!t3Var2.f49135k.isEmpty()) {
                    t3Var2.f49135k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f49187b.f48850c;
                if (!t3Var3.f49136l.isEmpty()) {
                    t3Var3.f49136l.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f49187b.f48850c.i(s3.BY_PRICE);
                return;
            case 4:
                this.f49187b.f48850c.i(s3.BY_DATE);
                return;
            default:
                this.f49187b.f48850c.i(s3.BY_NUMBER);
                return;
        }
    }
}
