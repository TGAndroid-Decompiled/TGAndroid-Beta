package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44470a;
    public final e0 f44471b;
    public final u0 f44472c;

    public c0(e0 e0Var, u0 u0Var, int i10) {
        this.f44470a = i10;
        this.f44471b = e0Var;
        this.f44472c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f44470a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44471b, this.f44472c, 1));
                return;
            default:
                e0 e0Var = this.f44471b;
                e0Var.getClass();
                e0Var.f44494i = this.f44472c.f44658a;
                return;
        }
    }
}
