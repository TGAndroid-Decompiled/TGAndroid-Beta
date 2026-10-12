package yh;

import org.telegram.tgnet.TLRPC;
public final class m1 implements Runnable {
    public final int f53085a;
    public final s3 f53086b;
    public final TLRPC.TL_error f53087c;
    public final Runnable d;

    public m1(s3 s3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f53085a = i10;
        this.f53086b = s3Var;
        this.f53087c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f53085a) {
            case 0:
                this.f53086b.getBulletinFactory().f0(this.f53087c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f53086b.getBulletinFactory().f0(this.f53087c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
