package zi;
public final class e0 implements Runnable {
    public final int f62206a;
    public final u0 f62207b;
    public final Exception f62208c;

    public e0(u0 u0Var, Exception exc, int i7) {
        this.f62206a = i7;
        this.f62207b = u0Var;
        this.f62208c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62206a) {
            case 0:
                this.f62207b.h(this.f62208c);
                return;
            case 1:
                this.f62207b.h(this.f62208c);
                return;
            case 2:
                this.f62207b.h(this.f62208c);
                return;
            default:
                this.f62207b.h(this.f62208c);
                return;
        }
    }
}
