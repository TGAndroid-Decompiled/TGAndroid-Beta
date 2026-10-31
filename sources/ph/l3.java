package ph;
public final class l3 implements Runnable {
    public final int f45211a;
    public final q3 f45212b;

    public l3(q3 q3Var, int i10) {
        this.f45211a = i10;
        this.f45212b = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f45211a) {
            case 0:
                this.f45212b.d1();
                return;
            default:
                q3 q3Var = this.f45212b;
                q3Var.a2.O(true);
                org.telegram.messenger.i0.h3(new l3(q3Var, 0), 150L);
                return;
        }
    }
}
