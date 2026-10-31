package yh;

import org.telegram.ui.un;
public final class f implements Runnable {
    public final int f54488a;
    public final l f54489b;
    public final long f54490c;

    public f(l lVar, long j10, int i10) {
        this.f54488a = i10;
        this.f54489b = lVar;
        this.f54490c = j10;
    }

    @Override
    public final void run() {
        switch (this.f54488a) {
            case 0:
                l.b0(this.f54489b, this.f54490c);
                return;
            default:
                l lVar = this.f54489b;
                lVar.getClass();
                lVar.presentFragment(un.ha(this.f54490c));
                return;
        }
    }
}
