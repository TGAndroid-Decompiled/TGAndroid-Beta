package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.x1;
public final class n {
    public final m f52183a;
    public long f52184b;
    public boolean f52185c;
    public final x1 d = new x1(this, 24);

    public n(m mVar) {
        this.f52183a = mVar;
    }

    public final void a(long j3) {
        if (this.f52185c && this.f52184b == j3) {
            return;
        }
        this.f52184b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f52185c = true;
        x1 x1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(x1Var);
        AndroidUtilities.runOnUIThread(x1Var, 1000L);
    }

    public final void b() {
        this.f52185c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
