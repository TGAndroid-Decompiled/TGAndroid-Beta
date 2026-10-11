package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f45622a;
    public final d0 f45623b;
    public final t0 f45624c;

    public b0(d0 d0Var, t0 t0Var, int i10) {
        this.f45622a = i10;
        this.f45623b = d0Var;
        this.f45624c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f45622a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f45623b, this.f45624c, 1));
                return;
            default:
                d0 d0Var = this.f45623b;
                d0Var.getClass();
                d0Var.f45649i = this.f45624c.f45822a;
                return;
        }
    }
}
