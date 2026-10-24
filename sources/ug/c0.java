package ug;
public final class c0 implements Runnable {
    public final int f48105a;
    public final e0 f48106b;

    public c0(e0 e0Var, int i10) {
        this.f48105a = i10;
        this.f48106b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f48105a) {
            case 0:
                e0.k0(this.f48106b);
                return;
            default:
                e0.j0(this.f48106b);
                return;
        }
    }
}
