package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41074a;
    public final e0 f41075b;
    public final t0 f41076c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41074a = i10;
        this.f41075b = e0Var;
        this.f41076c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41074a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41075b, this.f41076c, 1));
                return;
            default:
                e0 e0Var = this.f41075b;
                e0Var.getClass();
                e0Var.f41102i = this.f41076c.f41260a;
                return;
        }
    }
}
