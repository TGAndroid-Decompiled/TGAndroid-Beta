package vh;
public final class p8 implements Runnable {
    public final int f51773a;
    public final z8 f51774b;

    public p8(z8 z8Var, int i10) {
        this.f51773a = i10;
        this.f51774b = z8Var;
    }

    @Override
    public final void run() {
        switch (this.f51773a) {
            case 0:
                z8 z8Var = this.f51774b;
                x8 x8Var = z8Var.M;
                if (x8Var != null) {
                    long j10 = x8Var.f52175a;
                    if (j10 > 0) {
                        z8Var.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                t8 t8Var = this.f51774b.f52257a;
                if (t8Var != null) {
                    t8Var.K();
                    return;
                }
                return;
            default:
                t8 t8Var2 = this.f51774b.f52257a;
                if (t8Var2 != null) {
                    t8Var2.m();
                    return;
                }
                return;
        }
    }
}
