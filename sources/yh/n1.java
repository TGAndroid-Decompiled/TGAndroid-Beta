package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f47756a;
    public final x3 f47757b;
    public final TLRPC.TL_error f47758c;
    public final Runnable d;

    public n1(x3 x3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f47756a = i10;
        this.f47757b = x3Var;
        this.f47758c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f47756a) {
            case 0:
                this.f47757b.getBulletinFactory().d0(this.f47758c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f47757b.getBulletinFactory().d0(this.f47758c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
