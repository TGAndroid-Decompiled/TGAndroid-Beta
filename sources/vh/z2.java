package vh;
public final class z2 implements Runnable {
    public final int f52260a;
    public final b4 f52261b;
    public final jg.i2 f52262c;

    public z2(b4 b4Var, jg.i2 i2Var, int i10) {
        this.f52260a = i10;
        this.f52261b = b4Var;
        this.f52262c = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f52260a) {
            case 0:
                this.f52261b.A0(this.f52262c, true);
                return;
            default:
                this.f52261b.z0(this.f52262c);
                return;
        }
    }
}
