package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f40760a;
    public final d0 f40761b;
    public final s0 f40762c;

    public b0(d0 d0Var, s0 s0Var, int i10) {
        this.f40760a = i10;
        this.f40761b = d0Var;
        this.f40762c = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f40760a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f40761b, this.f40762c, 1));
                return;
            default:
                d0 d0Var = this.f40761b;
                d0Var.getClass();
                d0Var.f40782i = this.f40762c.f40935a;
                return;
        }
    }
}
