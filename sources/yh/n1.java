package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f47503a;
    public final a4 f47504b;
    public final TLRPC.TL_error f47505c;
    public final Runnable d;

    public n1(a4 a4Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f47503a = i10;
        this.f47504b = a4Var;
        this.f47505c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f47503a) {
            case 0:
                this.f47504b.getBulletinFactory().d0(this.f47505c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f47504b.getBulletinFactory().d0(this.f47505c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
