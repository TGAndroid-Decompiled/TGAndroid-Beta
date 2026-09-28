package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41077a;
    public final e0 f41078b;
    public final t0 f41079c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41077a = i10;
        this.f41078b = e0Var;
        this.f41079c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41077a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41078b, this.f41079c, 1));
                return;
            default:
                e0 e0Var = this.f41078b;
                e0Var.getClass();
                e0Var.f41105i = this.f41079c.f41263a;
                return;
        }
    }
}
