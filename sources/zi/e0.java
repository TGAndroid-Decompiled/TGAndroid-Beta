package zi;
public final class e0 implements Runnable {
    public final int f62088a;
    public final u0 f62089b;
    public final Exception f62090c;

    public e0(u0 u0Var, Exception exc, int i7) {
        this.f62088a = i7;
        this.f62089b = u0Var;
        this.f62090c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62088a) {
            case 0:
                this.f62089b.h(this.f62090c);
                return;
            case 1:
                this.f62089b.h(this.f62090c);
                return;
            case 2:
                this.f62089b.h(this.f62090c);
                return;
            default:
                this.f62089b.h(this.f62090c);
                return;
        }
    }
}
