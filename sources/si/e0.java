package si;
public final class e0 implements Runnable {
    public final int f46613a;
    public final t0 f46614b;
    public final Exception f46615c;

    public e0(t0 t0Var, Exception exc, int i10) {
        this.f46613a = i10;
        this.f46614b = t0Var;
        this.f46615c = exc;
    }

    @Override
    public final void run() {
        switch (this.f46613a) {
            case 0:
                this.f46614b.h(this.f46615c);
                return;
            case 1:
                this.f46614b.h(this.f46615c);
                return;
            case 2:
                this.f46614b.h(this.f46615c);
                return;
            default:
                this.f46614b.h(this.f46615c);
                return;
        }
    }
}
