package xh;
public final class p4 implements Runnable {
    public final int f51501a;
    public final z4 f51502b;

    public p4(z4 z4Var, int i10) {
        this.f51501a = i10;
        this.f51502b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f51501a) {
            case 0:
                this.f51502b.Z(false);
                return;
            case 1:
                this.f51502b.Z(true);
                return;
            case 2:
                z4.V(this.f51502b);
                return;
            case 3:
                z4.U(this.f51502b);
                return;
            case 4:
                z4.S(this.f51502b);
                return;
            default:
                this.f51502b.dismiss();
                return;
        }
    }
}
