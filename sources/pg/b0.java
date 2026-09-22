package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f40813a;
    public final d0 f40814b;
    public final r0 f40815c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f40813a = i10;
        this.f40814b = d0Var;
        this.f40815c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f40813a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f40814b, this.f40815c, 1));
                return;
            default:
                d0 d0Var = this.f40814b;
                d0Var.getClass();
                d0Var.f40835i = this.f40815c.f40972a;
                return;
        }
    }
}
