package tg;
public final class d0 implements Runnable {
    public final int f48519a;
    public final f0 f48520b;

    public d0(f0 f0Var, int i10) {
        this.f48519a = i10;
        this.f48520b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f48519a) {
            case 0:
                f0.f0(this.f48520b);
                return;
            default:
                f0.e0(this.f48520b);
                return;
        }
    }
}
