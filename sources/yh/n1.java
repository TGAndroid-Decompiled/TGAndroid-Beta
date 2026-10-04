package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f51671a;
    public final x3 f51672b;
    public final TLRPC.TL_error f51673c;
    public final Runnable d;

    public n1(x3 x3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f51671a = i10;
        this.f51672b = x3Var;
        this.f51673c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f51671a) {
            case 0:
                this.f51672b.getBulletinFactory().d0(this.f51673c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f51672b.getBulletinFactory().d0(this.f51673c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
