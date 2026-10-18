package ug;
public final class d0 implements Runnable {
    public final int f47709a;
    public final f0 f47710b;

    public d0(f0 f0Var, int i10) {
        this.f47709a = i10;
        this.f47710b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f47709a) {
            case 0:
                f0.f0(this.f47710b);
                return;
            default:
                f0.e0(this.f47710b);
                return;
        }
    }
}
