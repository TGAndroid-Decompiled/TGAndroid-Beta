package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41175a;
    public final e0 f41176b;
    public final t0 f41177c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41175a = i10;
        this.f41176b = e0Var;
        this.f41177c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41175a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41176b, this.f41177c, 1));
                return;
            default:
                e0 e0Var = this.f41176b;
                e0Var.getClass();
                e0Var.f41203i = this.f41177c.f41361a;
                return;
        }
    }
}
