package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41125a;
    public final e0 f41126b;
    public final t0 f41127c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41125a = i10;
        this.f41126b = e0Var;
        this.f41127c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41125a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41126b, this.f41127c, 1));
                return;
            default:
                e0 e0Var = this.f41126b;
                e0Var.getClass();
                e0Var.f41153i = this.f41127c.f41311a;
                return;
        }
    }
}
