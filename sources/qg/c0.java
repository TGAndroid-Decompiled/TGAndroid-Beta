package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44496a;
    public final e0 f44497b;
    public final t0 f44498c;

    public c0(e0 e0Var, t0 t0Var, int i10) {
        this.f44496a = i10;
        this.f44497b = e0Var;
        this.f44498c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44496a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44497b, this.f44498c, 1));
                return;
            default:
                e0 e0Var = this.f44497b;
                e0Var.getClass();
                e0Var.f44518i = this.f44498c.f44675a;
                return;
        }
    }
}
