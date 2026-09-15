package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f40817a;
    public final d0 f40818b;
    public final r0 f40819c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f40817a = i10;
        this.f40818b = d0Var;
        this.f40819c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f40817a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f40818b, this.f40819c, 1));
                return;
            default:
                d0 d0Var = this.f40818b;
                d0Var.getClass();
                d0Var.f40839i = this.f40819c.f40976a;
                return;
        }
    }
}
