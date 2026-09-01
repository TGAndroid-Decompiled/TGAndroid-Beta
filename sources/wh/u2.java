package wh;
public final class u2 implements Runnable {
    public final int f50068a;
    public final r3 f50069b;
    public final f2.u0 f50070c;

    public u2(r3 r3Var, f2.u0 u0Var, int i10) {
        this.f50068a = i10;
        this.f50069b = r3Var;
        this.f50070c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f50068a) {
            case 0:
                this.f50069b.setItemAnimator(this.f50070c);
                return;
            default:
                this.f50069b.setItemAnimator(this.f50070c);
                return;
        }
    }
}
