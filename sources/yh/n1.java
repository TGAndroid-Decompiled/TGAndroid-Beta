package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f47755a;
    public final x3 f47756b;
    public final TLRPC.TL_error f47757c;
    public final Runnable d;

    public n1(x3 x3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f47755a = i10;
        this.f47756b = x3Var;
        this.f47757c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f47755a) {
            case 0:
                this.f47756b.getBulletinFactory().d0(this.f47757c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f47756b.getBulletinFactory().d0(this.f47757c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
