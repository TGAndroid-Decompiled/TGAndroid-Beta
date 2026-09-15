package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f47480a;
    public final a4 f47481b;
    public final TLRPC.TL_error f47482c;
    public final Runnable d;

    public n1(a4 a4Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f47480a = i10;
        this.f47481b = a4Var;
        this.f47482c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f47480a) {
            case 0:
                this.f47481b.getBulletinFactory().d0(this.f47482c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f47481b.getBulletinFactory().d0(this.f47482c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
