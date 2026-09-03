package vh;
public final class u2 implements Runnable {
    public final int f46283a;
    public final s3 f46284b;
    public final f2.t0 f46285c;

    public u2(s3 s3Var, f2.t0 t0Var, int i10) {
        this.f46283a = i10;
        this.f46284b = s3Var;
        this.f46285c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f46283a) {
            case 0:
                this.f46284b.setItemAnimator(this.f46285c);
                return;
            default:
                this.f46284b.setItemAnimator(this.f46285c);
                return;
        }
    }
}
