package ph;
public final class s3 implements Runnable {
    public final int f42335a;
    public final c5 f42336b;
    public final dg.b3 f42337c;

    public s3(c5 c5Var, dg.b3 b3Var, int i10) {
        this.f42335a = i10;
        this.f42336b = c5Var;
        this.f42337c = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f42335a) {
            case 0:
                this.f42336b.D0(this.f42337c, true);
                return;
            default:
                this.f42336b.C0(this.f42337c);
                return;
        }
    }
}
