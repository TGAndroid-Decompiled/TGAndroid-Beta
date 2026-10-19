package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x3 implements Runnable {
    public final int f50577a;
    public final f4 f50578b;

    public x3(f4 f4Var, int i10) {
        this.f50577a = i10;
        this.f50578b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f50577a) {
            case 0:
                this.f50578b.a0();
                return;
            default:
                f4 f4Var = this.f50578b;
                f4Var.f50243i0.N(true);
                AndroidUtilities.runOnUIThread(new x3(f4Var, 0), 150L);
                return;
        }
    }
}
