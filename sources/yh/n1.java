package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f47788a;
    public final y3 f47789b;
    public final TLRPC.TL_error f47790c;
    public final Runnable d;

    public n1(y3 y3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f47788a = i10;
        this.f47789b = y3Var;
        this.f47790c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f47788a) {
            case 0:
                this.f47789b.getBulletinFactory().d0(this.f47790c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f47789b.getBulletinFactory().d0(this.f47790c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
