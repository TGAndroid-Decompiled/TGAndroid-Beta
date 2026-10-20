package ug;
public final class d0 implements Runnable {
    public final int f47669a;
    public final f0 f47670b;

    public d0(f0 f0Var, int i10) {
        this.f47669a = i10;
        this.f47670b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f47669a) {
            case 0:
                f0.f0(this.f47670b);
                return;
            default:
                f0.e0(this.f47670b);
                return;
        }
    }
}
