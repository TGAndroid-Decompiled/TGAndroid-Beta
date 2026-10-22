package si;
public final class e0 implements Runnable {
    public final int f46597a;
    public final s0 f46598b;
    public final Exception f46599c;

    public e0(s0 s0Var, Exception exc, int i10) {
        this.f46597a = i10;
        this.f46598b = s0Var;
        this.f46599c = exc;
    }

    @Override
    public final void run() {
        switch (this.f46597a) {
            case 0:
                this.f46598b.h(this.f46599c);
                return;
            case 1:
                this.f46598b.h(this.f46599c);
                return;
            case 2:
                this.f46598b.h(this.f46599c);
                return;
            default:
                this.f46598b.h(this.f46599c);
                return;
        }
    }
}
