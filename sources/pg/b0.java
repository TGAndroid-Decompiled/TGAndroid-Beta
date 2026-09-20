package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41105a;
    public final e0 f41106b;
    public final t0 f41107c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41105a = i10;
        this.f41106b = e0Var;
        this.f41107c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41105a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41106b, this.f41107c, 1));
                return;
            default:
                e0 e0Var = this.f41106b;
                e0Var.getClass();
                e0Var.f41131i = this.f41107c.f41292a;
                return;
        }
    }
}
