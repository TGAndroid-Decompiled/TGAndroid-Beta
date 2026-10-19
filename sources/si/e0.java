package si;
public final class e0 implements Runnable {
    public final int f46589a;
    public final s0 f46590b;
    public final Exception f46591c;

    public e0(s0 s0Var, Exception exc, int i10) {
        this.f46589a = i10;
        this.f46590b = s0Var;
        this.f46591c = exc;
    }

    @Override
    public final void run() {
        switch (this.f46589a) {
            case 0:
                this.f46590b.h(this.f46591c);
                return;
            case 1:
                this.f46590b.h(this.f46591c);
                return;
            case 2:
                this.f46590b.h(this.f46591c);
                return;
            default:
                this.f46590b.h(this.f46591c);
                return;
        }
    }
}
