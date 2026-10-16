package zh;

import org.telegram.tgnet.TLRPC;
public final class l1 implements Runnable {
    public final int f50780a;
    public final r3 f50781b;
    public final TLRPC.TL_error f50782c;
    public final Runnable d;

    public l1(r3 r3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f50780a = i10;
        this.f50781b = r3Var;
        this.f50782c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f50780a) {
            case 0:
                this.f50781b.getBulletinFactory().f0(this.f50782c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f50781b.getBulletinFactory().f0(this.f50782c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
