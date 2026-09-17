package zh;

import org.telegram.tgnet.TLRPC;
public final class m1 implements Runnable {
    public final int f52280a;
    public final w3 f52281b;
    public final TLRPC.TL_error f52282c;
    public final Runnable d;

    public m1(w3 w3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f52280a = i10;
        this.f52281b = w3Var;
        this.f52282c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f52280a) {
            case 0:
                this.f52281b.getBulletinFactory().d0(this.f52282c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f52281b.getBulletinFactory().d0(this.f52282c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
