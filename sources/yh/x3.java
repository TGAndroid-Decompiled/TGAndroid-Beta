package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x3 implements Runnable {
    public final int f49197a;
    public final f4 f49198b;

    public x3(f4 f4Var, int i10) {
        this.f49197a = i10;
        this.f49198b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f49197a) {
            case 0:
                this.f49198b.a0();
                return;
            default:
                f4 f4Var = this.f49198b;
                f4Var.f48870i0.N(true);
                AndroidUtilities.runOnUIThread(new x3(f4Var, 0), 150L);
                return;
        }
    }
}
