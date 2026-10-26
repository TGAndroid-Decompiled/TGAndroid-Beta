package vi;
public final class d0 implements Runnable {
    public final int f50368a;
    public final s0 f50369b;
    public final Exception f50370c;

    public d0(s0 s0Var, Exception exc, int i10) {
        this.f50368a = i10;
        this.f50369b = s0Var;
        this.f50370c = exc;
    }

    @Override
    public final void run() {
        switch (this.f50368a) {
            case 0:
                this.f50369b.h(this.f50370c);
                return;
            case 1:
                this.f50369b.h(this.f50370c);
                return;
            case 2:
                this.f50369b.h(this.f50370c);
                return;
            default:
                this.f50369b.h(this.f50370c);
                return;
        }
    }
}
