package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f47450a;
    public final z3 f47451b;
    public final TLRPC.TL_error f47452c;
    public final Runnable d;

    public n1(z3 z3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f47450a = i10;
        this.f47451b = z3Var;
        this.f47452c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f47450a) {
            case 0:
                this.f47451b.getBulletinFactory().d0(this.f47452c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f47451b.getBulletinFactory().d0(this.f47452c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
