package vi;
public final class d0 implements Runnable {
    public final int f50365a;
    public final s0 f50366b;
    public final Exception f50367c;

    public d0(s0 s0Var, Exception exc, int i10) {
        this.f50365a = i10;
        this.f50366b = s0Var;
        this.f50367c = exc;
    }

    @Override
    public final void run() {
        switch (this.f50365a) {
            case 0:
                this.f50366b.h(this.f50367c);
                return;
            case 1:
                this.f50366b.h(this.f50367c);
                return;
            case 2:
                this.f50366b.h(this.f50367c);
                return;
            default:
                this.f50366b.h(this.f50367c);
                return;
        }
    }
}
