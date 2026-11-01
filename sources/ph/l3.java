package ph;
public final class l3 implements Runnable {
    public final int f45222a;
    public final q3 f45223b;

    public l3(q3 q3Var, int i10) {
        this.f45222a = i10;
        this.f45223b = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f45222a) {
            case 0:
                this.f45223b.d1();
                return;
            default:
                q3 q3Var = this.f45223b;
                q3Var.a2.O(true);
                org.telegram.messenger.i0.h3(new l3(q3Var, 0), 150L);
                return;
        }
    }
}
