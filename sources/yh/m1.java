package yh;

import org.telegram.tgnet.TLRPC;
public final class m1 implements Runnable {
    public final int f52905a;
    public final s3 f52906b;
    public final TLRPC.TL_error f52907c;
    public final Runnable d;

    public m1(s3 s3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f52905a = i10;
        this.f52906b = s3Var;
        this.f52907c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f52905a) {
            case 0:
                this.f52906b.getBulletinFactory().f0(this.f52907c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f52906b.getBulletinFactory().f0(this.f52907c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
