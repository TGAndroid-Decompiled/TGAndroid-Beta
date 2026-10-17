package ug;
public final class c0 implements Runnable {
    public final int f47681a;
    public final e0 f47682b;

    public c0(e0 e0Var, int i10) {
        this.f47681a = i10;
        this.f47682b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f47681a) {
            case 0:
                e0.f0(this.f47682b);
                return;
            default:
                e0.e0(this.f47682b);
                return;
        }
    }
}
