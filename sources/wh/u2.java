package wh;
public final class u2 implements Runnable {
    public final int f50104a;
    public final r3 f50105b;
    public final f2.u0 f50106c;

    public u2(r3 r3Var, f2.u0 u0Var, int i10) {
        this.f50104a = i10;
        this.f50105b = r3Var;
        this.f50106c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f50104a) {
            case 0:
                this.f50105b.setItemAnimator(this.f50106c);
                return;
            default:
                this.f50105b.setItemAnimator(this.f50106c);
                return;
        }
    }
}
