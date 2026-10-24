package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44894a;
    public final e0 f44895b;
    public final t0 f44896c;

    public c0(e0 e0Var, t0 t0Var, int i10) {
        this.f44894a = i10;
        this.f44895b = e0Var;
        this.f44896c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44894a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44895b, this.f44896c, 1));
                return;
            default:
                e0 e0Var = this.f44895b;
                e0Var.getClass();
                e0Var.f44916i = this.f44896c.f45073a;
                return;
        }
    }
}
