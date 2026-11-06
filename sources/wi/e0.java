package wi;
public final class e0 implements Runnable {
    public final int f57867a;
    public final t0 f57868b;
    public final Exception f57869c;

    public e0(t0 t0Var, Exception exc, int i7) {
        this.f57867a = i7;
        this.f57868b = t0Var;
        this.f57869c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57867a) {
            case 0:
                this.f57868b.h(this.f57869c);
                return;
            case 1:
                this.f57868b.h(this.f57869c);
                return;
            case 2:
                this.f57868b.h(this.f57869c);
                return;
            default:
                this.f57868b.h(this.f57869c);
                return;
        }
    }
}
