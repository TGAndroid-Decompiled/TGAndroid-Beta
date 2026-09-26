package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x7 implements Runnable {
    public final int f48279a;
    public final o8 f48280b;

    public x7(o8 o8Var, int i10) {
        this.f48279a = i10;
        this.f48280b = o8Var;
    }

    @Override
    public final void run() {
        switch (this.f48279a) {
            case 0:
                o8 o8Var = this.f48280b;
                o8Var.R = true;
                o8Var.o(null);
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                return;
            case 1:
                this.f48280b.dismiss();
                return;
            default:
                c8 c8Var = this.f48280b.f47848r;
                c8Var.F = false;
                c8Var.invalidate();
                return;
        }
    }
}
