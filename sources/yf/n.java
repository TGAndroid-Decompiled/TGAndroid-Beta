package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.s1;
public final class n {
    public final m f51000a;
    public long f51001b;
    public boolean f51002c;
    public final s1 d = new s1(this, 20);

    public n(m mVar) {
        this.f51000a = mVar;
    }

    public final void a(long j3) {
        if (this.f51002c && this.f51001b == j3) {
            return;
        }
        this.f51001b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f51002c = true;
        s1 s1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(s1Var);
        AndroidUtilities.runOnUIThread(s1Var, 1000L);
    }

    public final void b() {
        this.f51002c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
