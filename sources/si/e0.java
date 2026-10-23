package si;
public final class e0 implements Runnable {
    public final int f46598a;
    public final s0 f46599b;
    public final Exception f46600c;

    public e0(s0 s0Var, Exception exc, int i10) {
        this.f46598a = i10;
        this.f46599b = s0Var;
        this.f46600c = exc;
    }

    @Override
    public final void run() {
        switch (this.f46598a) {
            case 0:
                this.f46599b.h(this.f46600c);
                return;
            case 1:
                this.f46599b.h(this.f46600c);
                return;
            case 2:
                this.f46599b.h(this.f46600c);
                return;
            default:
                this.f46599b.h(this.f46600c);
                return;
        }
    }
}
