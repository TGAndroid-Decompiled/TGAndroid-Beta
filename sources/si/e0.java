package si;
public final class e0 implements Runnable {
    public final int f46587a;
    public final s0 f46588b;
    public final Exception f46589c;

    public e0(s0 s0Var, Exception exc, int i10) {
        this.f46587a = i10;
        this.f46588b = s0Var;
        this.f46589c = exc;
    }

    @Override
    public final void run() {
        switch (this.f46587a) {
            case 0:
                this.f46588b.h(this.f46589c);
                return;
            case 1:
                this.f46588b.h(this.f46589c);
                return;
            case 2:
                this.f46588b.h(this.f46589c);
                return;
            default:
                this.f46588b.h(this.f46589c);
                return;
        }
    }
}
