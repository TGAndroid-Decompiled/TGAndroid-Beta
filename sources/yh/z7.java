package yh;

import org.telegram.messenger.AndroidUtilities;
public final class z7 implements Runnable {
    public final int f48095a;
    public final q8 f48096b;

    public z7(q8 q8Var, int i10) {
        this.f48095a = i10;
        this.f48096b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f48095a) {
            case 0:
                q8 q8Var = this.f48096b;
                q8Var.R = true;
                q8Var.o(null);
                AndroidUtilities.runOnUIThread(new z7(q8Var, 1), 240L);
                return;
            case 1:
                this.f48096b.dismiss();
                return;
            default:
                e8 e8Var = this.f48096b.f47704r;
                e8Var.F = false;
                e8Var.invalidate();
                return;
        }
    }
}
