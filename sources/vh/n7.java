package vh;

import org.telegram.messenger.dd;
public final class n7 implements Runnable {
    public final int f51583a = 1;
    public final o7 f51584b;
    public final Runnable f51585c;
    public final boolean d;

    public n7(o7 o7Var, Runnable runnable, boolean z10) {
        this.f51584b = o7Var;
        this.f51585c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f51583a;
        boolean z10 = this.d;
        Runnable runnable = this.f51585c;
        o7 o7Var = this.f51584b;
        switch (i11) {
            case 0:
                o7Var.g(runnable, z10);
                return;
            default:
                runnable.run();
                o8 o8Var = o7Var.f51618a;
                o2 o2Var = o8Var.T0;
                if (z10) {
                    i10 = 2131744679;
                } else {
                    i10 = 2131744680;
                }
                o2Var.f51607a.t(dd.L0(i10, null), false, true);
                o2Var.invalidate();
                o8Var.g(true, true);
                o8Var.c0(true);
                o8Var.I0.a(false, true);
                o8Var.J0.b(true, true);
                o8Var.h0(true, true);
                return;
        }
    }

    public n7(o7 o7Var, boolean z10, Runnable runnable) {
        this.f51584b = o7Var;
        this.d = z10;
        this.f51585c = runnable;
    }
}
