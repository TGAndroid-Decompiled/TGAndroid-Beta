package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x3 implements Runnable {
    public final int f49198a;
    public final f4 f49199b;

    public x3(f4 f4Var, int i10) {
        this.f49198a = i10;
        this.f49199b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f49198a) {
            case 0:
                this.f49199b.a0();
                return;
            default:
                f4 f4Var = this.f49199b;
                f4Var.f48871i0.N(true);
                AndroidUtilities.runOnUIThread(new x3(f4Var, 0), 150L);
                return;
        }
    }
}
