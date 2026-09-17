package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x3 implements Runnable {
    public final int f50627a;
    public final f4 f50628b;

    public x3(f4 f4Var, int i10) {
        this.f50627a = i10;
        this.f50628b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f50627a) {
            case 0:
                this.f50628b.Z();
                return;
            default:
                f4 f4Var = this.f50628b;
                f4Var.f50285i0.N(true);
                AndroidUtilities.runOnUIThread(new x3(f4Var, 0), 150L);
                return;
        }
    }
}
