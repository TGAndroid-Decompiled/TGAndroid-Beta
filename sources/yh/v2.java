package yh;
public final class v2 implements Runnable {
    public final int f50603a;
    public final g4 f50604b;

    public v2(g4 g4Var, int i10) {
        this.f50603a = i10;
        this.f50604b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50603a) {
            case 0:
                t3 t3Var = this.f50604b.d;
                if (!t3Var.f50565l.isEmpty()) {
                    t3Var.f50565l.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f50604b.d;
                if (!t3Var2.f50564k.isEmpty()) {
                    t3Var2.f50564k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f50604b.d;
                if (!t3Var3.f50563j.isEmpty()) {
                    t3Var3.f50563j.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50604b.d.i(s3.BY_PRICE);
                return;
            case 4:
                this.f50604b.d.i(s3.BY_DATE);
                return;
            default:
                this.f50604b.d.i(s3.BY_NUMBER);
                return;
        }
    }
}
