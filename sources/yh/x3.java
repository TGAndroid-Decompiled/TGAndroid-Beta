package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x3 implements Runnable {
    public final int f50655a;
    public final f4 f50656b;

    public x3(f4 f4Var, int i10) {
        this.f50655a = i10;
        this.f50656b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f50655a) {
            case 0:
                this.f50656b.Z();
                return;
            default:
                f4 f4Var = this.f50656b;
                f4Var.f50313i0.N(true);
                AndroidUtilities.runOnUIThread(new x3(f4Var, 0), 150L);
                return;
        }
    }
}
