package ph;
public final class s3 implements Runnable {
    public final int f42304a;
    public final c5 f42305b;
    public final dg.b3 f42306c;

    public s3(c5 c5Var, dg.b3 b3Var, int i10) {
        this.f42304a = i10;
        this.f42305b = c5Var;
        this.f42306c = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f42304a) {
            case 0:
                this.f42305b.D0(this.f42306c, true);
                return;
            default:
                this.f42305b.C0(this.f42306c);
                return;
        }
    }
}
