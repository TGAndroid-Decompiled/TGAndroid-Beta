package xf;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f49170a;
    public final d0 f49171b;
    public final r0 f49172c;

    public b0(d0 d0Var, r0 r0Var, int i9) {
        this.f49170a = i9;
        this.f49171b = d0Var;
        this.f49172c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f49170a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f49171b, this.f49172c, 1));
                return;
            default:
                d0 d0Var = this.f49171b;
                d0Var.getClass();
                d0Var.f49195i = this.f49172c.f49340a;
                return;
        }
    }
}
