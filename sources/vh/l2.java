package vh;
public final class l2 implements Runnable {
    public final int f51451a;
    public final n2 f51452b;

    public l2(n2 n2Var, int i10) {
        this.f51451a = i10;
        this.f51452b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f51451a) {
            case 0:
                this.f51452b.dismiss();
                return;
            default:
                n2.I0(this.f51452b);
                return;
        }
    }
}
