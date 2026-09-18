package yh;

import org.telegram.messenger.AndroidUtilities;
public final class w7 implements Runnable {
    public final int f48190a;
    public final o8 f48191b;

    public w7(o8 o8Var, int i10) {
        this.f48190a = i10;
        this.f48191b = o8Var;
    }

    @Override
    public final void run() {
        switch (this.f48190a) {
            case 0:
                o8 o8Var = this.f48191b;
                o8Var.R = true;
                o8Var.o(null);
                AndroidUtilities.runOnUIThread(new w7(o8Var, 1), 240L);
                return;
            case 1:
                this.f48191b.dismiss();
                return;
            default:
                c8 c8Var = this.f48191b.f47828r;
                c8Var.F = false;
                c8Var.invalidate();
                return;
        }
    }
}
