package rg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f47372a;
    public final e0 f47373b;
    public final r0 f47374c;

    public c0(e0 e0Var, r0 r0Var, int i10) {
        this.f47372a = i10;
        this.f47373b = e0Var;
        this.f47374c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f47372a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f47373b, this.f47374c, 1));
                return;
            default:
                e0 e0Var = this.f47373b;
                e0Var.getClass();
                e0Var.f47396i = this.f47374c.f47529a;
                return;
        }
    }
}
