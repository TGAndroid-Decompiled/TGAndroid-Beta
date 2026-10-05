package yh;

import org.telegram.messenger.AndroidUtilities;
public final class a8 implements Runnable {
    public final int f51114a;
    public final r8 f51115b;

    public a8(r8 r8Var, int i10) {
        this.f51114a = i10;
        this.f51115b = r8Var;
    }

    @Override
    public final void run() {
        switch (this.f51114a) {
            case 0:
                r8 r8Var = this.f51115b;
                r8Var.R = true;
                r8Var.o(null);
                AndroidUtilities.runOnUIThread(new a8(r8Var, 1), 240L);
                return;
            case 1:
                this.f51115b.dismiss();
                return;
            default:
                f8 f8Var = this.f51115b.f51943r;
                f8Var.F = false;
                f8Var.invalidate();
                return;
        }
    }
}
