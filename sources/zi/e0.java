package zi;
public final class e0 implements Runnable {
    public final int f62119a;
    public final u0 f62120b;
    public final Exception f62121c;

    public e0(u0 u0Var, Exception exc, int i7) {
        this.f62119a = i7;
        this.f62120b = u0Var;
        this.f62121c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62119a) {
            case 0:
                this.f62120b.h(this.f62121c);
                return;
            case 1:
                this.f62120b.h(this.f62121c);
                return;
            case 2:
                this.f62120b.h(this.f62121c);
                return;
            default:
                this.f62120b.h(this.f62121c);
                return;
        }
    }
}
