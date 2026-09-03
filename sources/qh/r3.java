package qh;
public final class r3 implements Runnable {
    public final int f45987a;
    public final a5 f45988b;
    public final eg.z2 f45989c;

    public r3(a5 a5Var, eg.z2 z2Var, int i10) {
        this.f45987a = i10;
        this.f45988b = a5Var;
        this.f45989c = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f45987a) {
            case 0:
                this.f45988b.D0(this.f45989c, true);
                return;
            default:
                this.f45988b.C0(this.f45989c);
                return;
        }
    }
}
