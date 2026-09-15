package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.w1;
public final class n {
    public final m f46846a;
    public long f46847b;
    public boolean f46848c;
    public final w1 d = new w1(this, 19);

    public n(m mVar) {
        this.f46846a = mVar;
    }

    public final void a(long j3) {
        if (this.f46848c && this.f46847b == j3) {
            return;
        }
        this.f46847b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f46848c = true;
        w1 w1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        AndroidUtilities.runOnUIThread(w1Var, 1000L);
    }

    public final void b() {
        this.f46848c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
