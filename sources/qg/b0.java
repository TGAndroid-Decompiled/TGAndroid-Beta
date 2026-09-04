package qg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44379a;
    public final d0 f44380b;
    public final r0 f44381c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f44379a = i10;
        this.f44380b = d0Var;
        this.f44381c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f44379a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44380b, this.f44381c, 1));
                return;
            default:
                d0 d0Var = this.f44380b;
                d0Var.getClass();
                d0Var.f44404i = this.f44381c.f44548a;
                return;
        }
    }
}
