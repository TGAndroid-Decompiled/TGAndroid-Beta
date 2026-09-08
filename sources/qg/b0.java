package qg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44407a;
    public final d0 f44408b;
    public final r0 f44409c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f44407a = i10;
        this.f44408b = d0Var;
        this.f44409c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f44407a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44408b, this.f44409c, 1));
                return;
            default:
                d0 d0Var = this.f44408b;
                d0Var.getClass();
                d0Var.f44432i = this.f44409c.f44576a;
                return;
        }
    }
}
