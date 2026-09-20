package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x7 implements Runnable {
    public final int f48267a;
    public final o8 f48268b;

    public x7(o8 o8Var, int i10) {
        this.f48267a = i10;
        this.f48268b = o8Var;
    }

    @Override
    public final void run() {
        switch (this.f48267a) {
            case 0:
                o8 o8Var = this.f48268b;
                o8Var.R = true;
                o8Var.o(null);
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                return;
            case 1:
                this.f48268b.dismiss();
                return;
            default:
                c8 c8Var = this.f48268b.f47871r;
                c8Var.F = false;
                c8Var.invalidate();
                return;
        }
    }
}
