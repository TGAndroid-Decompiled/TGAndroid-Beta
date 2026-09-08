package ug;
public final class f0 implements Runnable {
    public final int f47150a;
    public final h0 f47151b;

    public f0(h0 h0Var, int i10) {
        this.f47150a = i10;
        this.f47151b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f47150a) {
            case 0:
                h0.e0(this.f47151b);
                return;
            default:
                h0.d0(this.f47151b);
                return;
        }
    }
}
