package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44441a;
    public final e0 f44442b;
    public final t0 f44443c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f44441a = i10;
        this.f44442b = e0Var;
        this.f44443c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44441a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44442b, this.f44443c, 1));
                return;
            default:
                e0 e0Var = this.f44442b;
                e0Var.getClass();
                e0Var.f44472i = this.f44443c.f44641a;
                return;
        }
    }
}
