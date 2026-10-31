package vh;
public final class c7 implements Runnable {
    public final int f51039a;
    public final o8 f51040b;
    public final Runnable f51041c;

    public c7(o8 o8Var, Runnable runnable, int i10) {
        this.f51039a = i10;
        this.f51040b = o8Var;
        this.f51041c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f51039a) {
            case 0:
                this.f51041c.run();
                this.f51040b.o0();
                return;
            default:
                o8 o8Var = this.f51040b;
                o8Var.e(false);
                org.telegram.messenger.i0.r(o8Var.f51627g2);
                o8Var.f51627g2 = null;
                o8Var.S1 = false;
                this.f51041c.run();
                return;
        }
    }
}
