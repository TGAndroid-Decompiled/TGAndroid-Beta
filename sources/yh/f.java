package yh;

import org.telegram.ui.un;
public final class f implements Runnable {
    public final int f54492a;
    public final l f54493b;
    public final long f54494c;

    public f(l lVar, long j10, int i10) {
        this.f54492a = i10;
        this.f54493b = lVar;
        this.f54494c = j10;
    }

    @Override
    public final void run() {
        switch (this.f54492a) {
            case 0:
                l.c0(this.f54493b, this.f54494c);
                return;
            default:
                l lVar = this.f54493b;
                lVar.getClass();
                lVar.presentFragment(un.ma(this.f54494c));
                return;
        }
    }
}
