package ug;
public final class f0 implements Runnable {
    public final int f47151a;
    public final h0 f47152b;

    public f0(h0 h0Var, int i10) {
        this.f47151a = i10;
        this.f47152b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f47151a) {
            case 0:
                h0.e0(this.f47152b);
                return;
            default:
                h0.d0(this.f47152b);
                return;
        }
    }
}
