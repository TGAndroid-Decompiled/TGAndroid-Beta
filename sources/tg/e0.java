package tg;
public final class e0 implements Runnable {
    public final int f47004a;
    public final g0 f47005b;

    public e0(g0 g0Var, int i10) {
        this.f47004a = i10;
        this.f47005b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f47004a) {
            case 0:
                g0.e0(this.f47005b);
                return;
            default:
                g0.d0(this.f47005b);
                return;
        }
    }
}
