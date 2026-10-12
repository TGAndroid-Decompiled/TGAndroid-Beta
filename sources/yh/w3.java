package yh;
public final class w3 implements Runnable {
    public final int f49187a;
    public final e4 f49188b;

    public w3(e4 e4Var, int i10) {
        this.f49187a = i10;
        this.f49188b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f49187a) {
            case 0:
                t3 t3Var = this.f49188b.f48851c;
                if (!t3Var.f49135j.isEmpty()) {
                    t3Var.f49135j.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f49188b.f48851c;
                if (!t3Var2.f49136k.isEmpty()) {
                    t3Var2.f49136k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f49188b.f48851c;
                if (!t3Var3.f49137l.isEmpty()) {
                    t3Var3.f49137l.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f49188b.f48851c.i(s3.BY_PRICE);
                return;
            case 4:
                this.f49188b.f48851c.i(s3.BY_DATE);
                return;
            default:
                this.f49188b.f48851c.i(s3.BY_NUMBER);
                return;
        }
    }
}
