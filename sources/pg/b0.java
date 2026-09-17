package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f40839a;
    public final d0 f40840b;
    public final r0 f40841c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f40839a = i10;
        this.f40840b = d0Var;
        this.f40841c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f40839a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f40840b, this.f40841c, 1));
                return;
            default:
                d0 d0Var = this.f40840b;
                d0Var.getClass();
                d0Var.f40861i = this.f40841c.f40998a;
                return;
        }
    }
}
