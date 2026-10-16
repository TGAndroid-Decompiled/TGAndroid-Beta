package ri;
public final class c0 implements Runnable {
    public final int f44503a;
    public final r0 f44504b;
    public final Exception f44505c;

    public c0(r0 r0Var, Exception exc, int i10) {
        this.f44503a = i10;
        this.f44504b = r0Var;
        this.f44505c = exc;
    }

    @Override
    public final void run() {
        switch (this.f44503a) {
            case 0:
                this.f44504b.h(this.f44505c);
                return;
            case 1:
                this.f44504b.h(this.f44505c);
                return;
            case 2:
                this.f44504b.h(this.f44505c);
                return;
            default:
                this.f44504b.h(this.f44505c);
                return;
        }
    }
}
