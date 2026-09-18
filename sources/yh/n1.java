package yh;

import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f47508a;
    public final a4 f47509b;
    public final TLRPC.TL_error f47510c;
    public final Runnable d;

    public n1(a4 a4Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f47508a = i10;
        this.f47509b = a4Var;
        this.f47510c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f47508a) {
            case 0:
                this.f47509b.getBulletinFactory().d0(this.f47510c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f47509b.getBulletinFactory().d0(this.f47510c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
