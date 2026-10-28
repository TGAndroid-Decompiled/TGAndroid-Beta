package rg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f47407a;
    public final e0 f47408b;
    public final r0 f47409c;

    public c0(e0 e0Var, r0 r0Var, int i10) {
        this.f47407a = i10;
        this.f47408b = e0Var;
        this.f47409c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f47407a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f47408b, this.f47409c, 1));
                return;
            default:
                e0 e0Var = this.f47408b;
                e0Var.getClass();
                e0Var.f47431i = this.f47409c.f47564a;
                return;
        }
    }
}
