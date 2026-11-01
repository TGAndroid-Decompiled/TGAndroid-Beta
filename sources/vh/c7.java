package vh;
public final class c7 implements Runnable {
    public final int f51057a;
    public final o8 f51058b;
    public final Runnable f51059c;

    public c7(o8 o8Var, Runnable runnable, int i10) {
        this.f51057a = i10;
        this.f51058b = o8Var;
        this.f51059c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f51057a) {
            case 0:
                this.f51059c.run();
                this.f51058b.o0();
                return;
            default:
                o8 o8Var = this.f51058b;
                o8Var.e(false);
                org.telegram.messenger.i0.r(o8Var.f51642g2);
                o8Var.f51642g2 = null;
                o8Var.S1 = false;
                this.f51059c.run();
                return;
        }
    }
}
