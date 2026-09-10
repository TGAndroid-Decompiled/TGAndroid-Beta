package xh;

import org.telegram.tgnet.TLRPC;
public final class m1 implements Runnable {
    public final int f45693a;
    public final x3 f45694b;
    public final TLRPC.TL_error f45695c;
    public final Runnable d;

    public m1(x3 x3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f45693a = i10;
        this.f45694b = x3Var;
        this.f45695c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45693a) {
            case 0:
                this.f45694b.getBulletinFactory().d0(this.f45695c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f45694b.getBulletinFactory().d0(this.f45695c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
