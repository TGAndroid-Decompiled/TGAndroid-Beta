package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x3 implements Runnable {
    public final int f51043a;
    public final f4 f51044b;

    public x3(f4 f4Var, int i10) {
        this.f51043a = i10;
        this.f51044b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f51043a) {
            case 0:
                this.f51044b.Z();
                return;
            default:
                f4 f4Var = this.f51044b;
                f4Var.f50696i0.N(true);
                AndroidUtilities.runOnUIThread(new x3(f4Var, 0), 150L);
                return;
        }
    }
}
