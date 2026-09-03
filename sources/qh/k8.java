package qh;

import org.telegram.messenger.AndroidUtilities;
public final class k8 implements Runnable {
    public final int f45623a;
    public final ba f45624b;
    public final Runnable f45625c;

    public k8(ba baVar, Runnable runnable, int i10) {
        this.f45623a = i10;
        this.f45624b = baVar;
        this.f45625c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45623a) {
            case 0:
                this.f45625c.run();
                this.f45624b.p0();
                return;
            default:
                ba baVar = this.f45624b;
                baVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(baVar.f45053d2);
                baVar.f45053d2 = null;
                baVar.P1 = false;
                this.f45625c.run();
                return;
        }
    }
}
