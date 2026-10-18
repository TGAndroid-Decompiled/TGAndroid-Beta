package ug;
public final class d0 implements Runnable {
    public final int f47662a;
    public final f0 f47663b;

    public d0(f0 f0Var, int i10) {
        this.f47662a = i10;
        this.f47663b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f47662a) {
            case 0:
                f0.f0(this.f47663b);
                return;
            default:
                f0.e0(this.f47663b);
                return;
        }
    }
}
