package th;
public final class j2 implements Runnable {
    public final int f48520a;
    public final p3 f48521b;
    public final int f48522c;
    public final int d;

    public j2(p3 p3Var, int i10, int i11, int i12) {
        this.f48520a = i12;
        this.f48521b = p3Var;
        this.f48522c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f48520a) {
            case 0:
                this.f48521b.Y1(this.f48522c, this.d);
                return;
            default:
                this.f48521b.g4(this.f48522c, this.d);
                return;
        }
    }
}
