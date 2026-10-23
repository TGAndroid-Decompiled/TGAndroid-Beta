package ug;
public final class d0 implements Runnable {
    public final int f47673a;
    public final f0 f47674b;

    public d0(f0 f0Var, int i10) {
        this.f47673a = i10;
        this.f47674b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f47673a) {
            case 0:
                f0.f0(this.f47674b);
                return;
            default:
                f0.e0(this.f47674b);
                return;
        }
    }
}
