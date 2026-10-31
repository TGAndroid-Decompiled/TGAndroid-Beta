package vh;
public final class z2 implements Runnable {
    public final int f52242a;
    public final b4 f52243b;
    public final jg.i2 f52244c;

    public z2(b4 b4Var, jg.i2 i2Var, int i10) {
        this.f52242a = i10;
        this.f52243b = b4Var;
        this.f52244c = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f52242a) {
            case 0:
                this.f52243b.A0(this.f52244c, true);
                return;
            default:
                this.f52243b.z0(this.f52244c);
                return;
        }
    }
}
