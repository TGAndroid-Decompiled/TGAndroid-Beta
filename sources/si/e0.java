package si;
public final class e0 implements Runnable {
    public final int f46594a;
    public final s0 f46595b;
    public final Exception f46596c;

    public e0(s0 s0Var, Exception exc, int i10) {
        this.f46594a = i10;
        this.f46595b = s0Var;
        this.f46596c = exc;
    }

    @Override
    public final void run() {
        switch (this.f46594a) {
            case 0:
                this.f46595b.h(this.f46596c);
                return;
            case 1:
                this.f46595b.h(this.f46596c);
                return;
            case 2:
                this.f46595b.h(this.f46596c);
                return;
            default:
                this.f46595b.h(this.f46596c);
                return;
        }
    }
}
