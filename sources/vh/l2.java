package vh;
public final class l2 implements Runnable {
    public final int f46072a;
    public final s3 f46073b;
    public final int f46074c;
    public final int d;

    public l2(s3 s3Var, int i10, int i11, int i12) {
        this.f46072a = i12;
        this.f46073b = s3Var;
        this.f46074c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f46072a) {
            case 0:
                this.f46073b.X1(this.f46074c, this.d);
                return;
            default:
                this.f46073b.f4(this.f46074c, this.d);
                return;
        }
    }
}
