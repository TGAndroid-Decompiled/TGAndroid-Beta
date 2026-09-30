package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41078a;
    public final e0 f41079b;
    public final t0 f41080c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41078a = i10;
        this.f41079b = e0Var;
        this.f41080c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41078a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41079b, this.f41080c, 1));
                return;
            default:
                e0 e0Var = this.f41079b;
                e0Var.getClass();
                e0Var.f41106i = this.f41080c.f41264a;
                return;
        }
    }
}
