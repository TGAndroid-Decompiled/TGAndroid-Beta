package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.w1;
public final class n {
    public final m f46869a;
    public long f46870b;
    public boolean f46871c;
    public final w1 d = new w1(this, 19);

    public n(m mVar) {
        this.f46869a = mVar;
    }

    public final void a(long j3) {
        if (this.f46871c && this.f46870b == j3) {
            return;
        }
        this.f46870b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f46871c = true;
        w1 w1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        AndroidUtilities.runOnUIThread(w1Var, 1000L);
    }

    public final void b() {
        this.f46871c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
