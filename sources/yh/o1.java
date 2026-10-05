package yh;

import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f51723a;
    public final y3 f51724b;
    public final TLRPC.TL_error f51725c;
    public final Runnable d;

    public o1(y3 y3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f51723a = i10;
        this.f51724b = y3Var;
        this.f51725c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f51723a) {
            case 0:
                this.f51724b.getBulletinFactory().d0(this.f51725c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f51724b.getBulletinFactory().d0(this.f51725c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
