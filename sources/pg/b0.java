package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41064a;
    public final e0 f41065b;
    public final t0 f41066c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41064a = i10;
        this.f41065b = e0Var;
        this.f41066c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41064a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41065b, this.f41066c, 1));
                return;
            default:
                e0 e0Var = this.f41065b;
                e0Var.getClass();
                e0Var.f41090i = this.f41066c.f41251a;
                return;
        }
    }
}
