package zh;

import org.telegram.tgnet.TLRPC;
public final class m1 implements Runnable {
    public final int f52249a;
    public final w3 f52250b;
    public final TLRPC.TL_error f52251c;
    public final Runnable d;

    public m1(w3 w3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.f52249a = i10;
        this.f52250b = w3Var;
        this.f52251c = tL_error;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f52249a) {
            case 0:
                this.f52250b.getBulletinFactory().d0(this.f52251c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f52250b.getBulletinFactory().d0(this.f52251c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
