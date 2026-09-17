package zh;

import org.telegram.messenger.AndroidUtilities;
public final class w7 implements Runnable {
    public final int f52810a;
    public final n8 f52811b;

    public w7(n8 n8Var, int i10) {
        this.f52810a = i10;
        this.f52811b = n8Var;
    }

    @Override
    public final void run() {
        switch (this.f52810a) {
            case 0:
                n8 n8Var = this.f52811b;
                n8Var.R = true;
                n8Var.o(null);
                AndroidUtilities.runOnUIThread(new w7(n8Var, 1), 240L);
                return;
            case 1:
                this.f52811b.dismiss();
                return;
            default:
                b8 b8Var = this.f52811b.f52342r;
                b8Var.F = false;
                b8Var.invalidate();
                return;
        }
    }
}
