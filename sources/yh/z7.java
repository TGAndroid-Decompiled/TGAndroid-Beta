package yh;

import org.telegram.messenger.AndroidUtilities;
public final class z7 implements Runnable {
    public final int f48100a;
    public final q8 f48101b;

    public z7(q8 q8Var, int i10) {
        this.f48100a = i10;
        this.f48101b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f48100a) {
            case 0:
                q8 q8Var = this.f48101b;
                q8Var.R = true;
                q8Var.o(null);
                AndroidUtilities.runOnUIThread(new z7(q8Var, 1), 240L);
                return;
            case 1:
                this.f48101b.dismiss();
                return;
            default:
                e8 e8Var = this.f48101b.f47709r;
                e8Var.F = false;
                e8Var.invalidate();
                return;
        }
    }
}
