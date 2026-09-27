package yh;

import org.telegram.messenger.AndroidUtilities;
public final class w7 implements Runnable {
    public final int f48245a;
    public final n8 f48246b;

    public w7(n8 n8Var, int i10) {
        this.f48245a = i10;
        this.f48246b = n8Var;
    }

    @Override
    public final void run() {
        switch (this.f48245a) {
            case 0:
                n8 n8Var = this.f48246b;
                n8Var.R = true;
                n8Var.o(null);
                AndroidUtilities.runOnUIThread(new w7(n8Var, 1), 240L);
                return;
            case 1:
                this.f48246b.dismiss();
                return;
            default:
                b8 b8Var = this.f48246b.f47840r;
                b8Var.F = false;
                b8Var.invalidate();
                return;
        }
    }
}
