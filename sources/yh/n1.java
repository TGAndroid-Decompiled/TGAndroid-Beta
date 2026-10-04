package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f51670a;
    public final x3 f51671b;
    public final TLRPC.TL_error f51672c;
    public final Runnable d;

    public n1(x3 x3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f51670a = i10;
        this.f51671b = x3Var;
        this.f51672c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f51670a) {
            case 0:
                this.f51671b.getBulletinFactory().d0(this.f51672c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f51671b.getBulletinFactory().d0(this.f51672c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
