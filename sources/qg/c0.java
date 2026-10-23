package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44895a;
    public final e0 f44896b;
    public final t0 f44897c;

    public c0(e0 e0Var, t0 t0Var, int i10) {
        this.f44895a = i10;
        this.f44896b = e0Var;
        this.f44897c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44895a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44896b, this.f44897c, 1));
                return;
            default:
                e0 e0Var = this.f44896b;
                e0Var.getClass();
                e0Var.f44917i = this.f44897c.f45074a;
                return;
        }
    }
}
