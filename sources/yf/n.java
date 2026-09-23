package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.w1;
public final class n {
    public final m f46797a;
    public long f46798b;
    public boolean f46799c;
    public final w1 d = new w1(this, 19);

    public n(m mVar) {
        this.f46797a = mVar;
    }

    public final void a(long j3) {
        if (this.f46799c && this.f46798b == j3) {
            return;
        }
        this.f46798b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f46799c = true;
        w1 w1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        AndroidUtilities.runOnUIThread(w1Var, 1000L);
    }

    public final void b() {
        this.f46799c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
