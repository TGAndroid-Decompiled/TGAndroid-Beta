package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f45656a;
    public final d0 f45657b;
    public final t0 f45658c;

    public b0(d0 d0Var, t0 t0Var, int i10) {
        this.f45656a = i10;
        this.f45657b = d0Var;
        this.f45658c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f45656a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f45657b, this.f45658c, 1));
                return;
            default:
                d0 d0Var = this.f45657b;
                d0Var.getClass();
                d0Var.f45683i = this.f45658c.f45856a;
                return;
        }
    }
}
