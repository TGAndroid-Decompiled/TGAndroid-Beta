package yh;

import org.telegram.messenger.AndroidUtilities;
public final class z7 implements Runnable {
    public final int f48072a;
    public final q8 f48073b;

    public z7(q8 q8Var, int i10) {
        this.f48072a = i10;
        this.f48073b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f48072a) {
            case 0:
                q8 q8Var = this.f48073b;
                q8Var.R = true;
                q8Var.o(null);
                AndroidUtilities.runOnUIThread(new z7(q8Var, 1), 240L);
                return;
            case 1:
                this.f48073b.dismiss();
                return;
            default:
                e8 e8Var = this.f48073b.f47681r;
                e8Var.F = false;
                e8Var.invalidate();
                return;
        }
    }
}
