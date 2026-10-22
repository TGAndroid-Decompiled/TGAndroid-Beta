package ug;
public final class d0 implements Runnable {
    public final int f47672a;
    public final f0 f47673b;

    public d0(f0 f0Var, int i10) {
        this.f47672a = i10;
        this.f47673b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f47672a) {
            case 0:
                f0.f0(this.f47673b);
                return;
            default:
                f0.e0(this.f47673b);
                return;
        }
    }
}
