package zh;
public final class e5 implements Runnable {
    public final int f48382a;
    public final h5 f48383b;

    public e5(h5 h5Var, int i10) {
        this.f48382a = i10;
        this.f48383b = h5Var;
    }

    @Override
    public final void run() {
        switch (this.f48382a) {
            case 0:
                this.f48383b.e();
                return;
            default:
                this.f48383b.b();
                return;
        }
    }
}
