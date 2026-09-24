package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41062a;
    public final e0 f41063b;
    public final t0 f41064c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41062a = i10;
        this.f41063b = e0Var;
        this.f41064c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41062a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41063b, this.f41064c, 1));
                return;
            default:
                e0 e0Var = this.f41063b;
                e0Var.getClass();
                e0Var.f41090i = this.f41064c.f41248a;
                return;
        }
    }
}
