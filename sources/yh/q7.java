package yh;

import org.telegram.messenger.AndroidUtilities;
public final class q7 implements Runnable {
    public final int f53084a;
    public final h8 f53085b;

    public q7(h8 h8Var, int i10) {
        this.f53084a = i10;
        this.f53085b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f53084a) {
            case 0:
                h8 h8Var = this.f53085b;
                h8Var.S = true;
                h8Var.q(null);
                AndroidUtilities.runOnUIThread(new q7(h8Var, 1), 240L);
                return;
            case 1:
                this.f53085b.dismiss();
                return;
            default:
                v7 v7Var = this.f53085b.f52651r;
                v7Var.F = false;
                v7Var.invalidate();
                return;
        }
    }
}
