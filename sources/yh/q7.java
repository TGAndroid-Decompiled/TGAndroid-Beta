package yh;

import org.telegram.messenger.AndroidUtilities;
public final class q7 implements Runnable {
    public final int f53086a;
    public final h8 f53087b;

    public q7(h8 h8Var, int i10) {
        this.f53086a = i10;
        this.f53087b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f53086a) {
            case 0:
                h8 h8Var = this.f53087b;
                h8Var.S = true;
                h8Var.q(null);
                AndroidUtilities.runOnUIThread(new q7(h8Var, 1), 240L);
                return;
            case 1:
                this.f53087b.dismiss();
                return;
            default:
                v7 v7Var = this.f53087b.f52653r;
                v7Var.F = false;
                v7Var.invalidate();
                return;
        }
    }
}
