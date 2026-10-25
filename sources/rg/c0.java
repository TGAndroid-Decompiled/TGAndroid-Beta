package rg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f47369a;
    public final e0 f47370b;
    public final r0 f47371c;

    public c0(e0 e0Var, r0 r0Var, int i10) {
        this.f47369a = i10;
        this.f47370b = e0Var;
        this.f47371c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f47369a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f47370b, this.f47371c, 1));
                return;
            default:
                e0 e0Var = this.f47370b;
                e0Var.getClass();
                e0Var.f47393i = this.f47371c.f47526a;
                return;
        }
    }
}
