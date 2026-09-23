package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x7 implements Runnable {
    public final int f47914a;
    public final o8 f47915b;

    public x7(o8 o8Var, int i10) {
        this.f47914a = i10;
        this.f47915b = o8Var;
    }

    @Override
    public final void run() {
        switch (this.f47914a) {
            case 0:
                o8 o8Var = this.f47915b;
                o8Var.R = true;
                o8Var.o(null);
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                return;
            case 1:
                this.f47915b.dismiss();
                return;
            default:
                c8 c8Var = this.f47915b.f47520r;
                c8Var.F = false;
                c8Var.invalidate();
                return;
        }
    }
}
