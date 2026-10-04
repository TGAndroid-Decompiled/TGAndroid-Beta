package yh;

import org.telegram.messenger.AndroidUtilities;
public final class y7 implements Runnable {
    public final int f52299a;
    public final p8 f52300b;

    public y7(p8 p8Var, int i10) {
        this.f52299a = i10;
        this.f52300b = p8Var;
    }

    @Override
    public final void run() {
        switch (this.f52299a) {
            case 0:
                p8 p8Var = this.f52300b;
                p8Var.R = true;
                p8Var.o(null);
                AndroidUtilities.runOnUIThread(new y7(p8Var, 1), 240L);
                return;
            case 1:
                this.f52300b.dismiss();
                return;
            default:
                d8 d8Var = this.f52300b.f51835r;
                d8Var.F = false;
                d8Var.invalidate();
                return;
        }
    }
}
