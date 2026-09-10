package xh;

import org.telegram.messenger.AndroidUtilities;
public final class a8 implements Runnable {
    public final int f45252a;
    public final r8 f45253b;

    public a8(r8 r8Var, int i10) {
        this.f45252a = i10;
        this.f45253b = r8Var;
    }

    @Override
    public final void run() {
        switch (this.f45252a) {
            case 0:
                r8 r8Var = this.f45253b;
                r8Var.R = true;
                r8Var.o(null);
                AndroidUtilities.runOnUIThread(new a8(r8Var, 1), 240L);
                return;
            case 1:
                this.f45253b.dismiss();
                return;
            default:
                f8 f8Var = this.f45253b.f45992r;
                f8Var.F = false;
                f8Var.invalidate();
                return;
        }
    }
}
