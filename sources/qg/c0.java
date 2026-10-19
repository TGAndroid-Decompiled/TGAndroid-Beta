package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44468a;
    public final e0 f44469b;
    public final u0 f44470c;

    public c0(e0 e0Var, u0 u0Var, int i10) {
        this.f44468a = i10;
        this.f44469b = e0Var;
        this.f44470c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f44468a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44469b, this.f44470c, 1));
                return;
            default:
                e0 e0Var = this.f44469b;
                e0Var.getClass();
                e0Var.f44492i = this.f44470c.f44656a;
                return;
        }
    }
}
