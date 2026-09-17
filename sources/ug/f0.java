package ug;
public final class f0 implements Runnable {
    public final int f47123a;
    public final h0 f47124b;

    public f0(h0 h0Var, int i10) {
        this.f47123a = i10;
        this.f47124b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f47123a) {
            case 0:
                h0.e0(this.f47124b);
                return;
            default:
                h0.d0(this.f47124b);
                return;
        }
    }
}
