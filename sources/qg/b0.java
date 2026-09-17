package qg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44408a;
    public final d0 f44409b;
    public final r0 f44410c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f44408a = i10;
        this.f44409b = d0Var;
        this.f44410c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f44408a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44409b, this.f44410c, 1));
                return;
            default:
                d0 d0Var = this.f44409b;
                d0Var.getClass();
                d0Var.f44433i = this.f44410c.f44577a;
                return;
        }
    }
}
