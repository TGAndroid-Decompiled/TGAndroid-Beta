package zh;

import org.telegram.messenger.AndroidUtilities;
public final class w7 implements Runnable {
    public final int f52840a;
    public final n8 f52841b;

    public w7(n8 n8Var, int i10) {
        this.f52840a = i10;
        this.f52841b = n8Var;
    }

    @Override
    public final void run() {
        switch (this.f52840a) {
            case 0:
                n8 n8Var = this.f52841b;
                n8Var.R = true;
                n8Var.o(null);
                AndroidUtilities.runOnUIThread(new w7(n8Var, 1), 240L);
                return;
            case 1:
                this.f52841b.dismiss();
                return;
            default:
                b8 b8Var = this.f52841b.f52372r;
                b8Var.F = false;
                b8Var.invalidate();
                return;
        }
    }
}
