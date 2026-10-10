package yh;

import org.telegram.messenger.AndroidUtilities;
public final class q7 implements Runnable {
    public final int f53130a;
    public final h8 f53131b;

    public q7(h8 h8Var, int i10) {
        this.f53130a = i10;
        this.f53131b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f53130a) {
            case 0:
                h8 h8Var = this.f53131b;
                h8Var.S = true;
                h8Var.q(null);
                AndroidUtilities.runOnUIThread(new q7(h8Var, 1), 240L);
                return;
            case 1:
                this.f53131b.dismiss();
                return;
            default:
                v7 v7Var = this.f53131b.f52697r;
                v7Var.F = false;
                v7Var.invalidate();
                return;
        }
    }
}
