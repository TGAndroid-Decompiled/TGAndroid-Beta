package si;
public final class e0 implements Runnable {
    public final int f46634a;
    public final s0 f46635b;
    public final Exception f46636c;

    public e0(s0 s0Var, Exception exc, int i10) {
        this.f46634a = i10;
        this.f46635b = s0Var;
        this.f46636c = exc;
    }

    @Override
    public final void run() {
        switch (this.f46634a) {
            case 0:
                this.f46635b.h(this.f46636c);
                return;
            case 1:
                this.f46635b.h(this.f46636c);
                return;
            case 2:
                this.f46635b.h(this.f46636c);
                return;
            default:
                this.f46635b.h(this.f46636c);
                return;
        }
    }
}
