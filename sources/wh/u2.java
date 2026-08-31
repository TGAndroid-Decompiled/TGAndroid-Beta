package wh;
public final class u2 implements Runnable {
    public final int f50067a;
    public final r3 f50068b;
    public final f2.u0 f50069c;

    public u2(r3 r3Var, f2.u0 u0Var, int i10) {
        this.f50067a = i10;
        this.f50068b = r3Var;
        this.f50069c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f50067a) {
            case 0:
                this.f50068b.setItemAnimator(this.f50069c);
                return;
            default:
                this.f50068b.setItemAnimator(this.f50069c);
                return;
        }
    }
}
