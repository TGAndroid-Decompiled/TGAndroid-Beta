package zi;

import y7.h7;
public final class j0 implements Runnable {
    public final int f62243a;
    public final h7 f62244b;
    public final Exception f62245c;

    public j0(h7 h7Var, Exception exc, int i7) {
        this.f62243a = i7;
        this.f62244b = h7Var;
        this.f62245c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62243a) {
            case 0:
                u0 u0Var = (u0) this.f62244b.f60952a;
                u0Var.f62451m.a("recording segment interrupted in state=".concat(yi.i.e(u0Var.f62440a0)), this.f62245c);
                int i7 = u0Var.f62440a0;
                if (i7 == 3) {
                    u0Var.q();
                    return;
                } else if (i7 == 2) {
                    u0Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((u0) this.f62244b.f60952a).h(this.f62245c);
                return;
        }
    }
}
