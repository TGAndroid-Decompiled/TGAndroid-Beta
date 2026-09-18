package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.w1;
public final class n {
    public final m f47103a;
    public long f47104b;
    public boolean f47105c;
    public final w1 d = new w1(this, 19);

    public n(m mVar) {
        this.f47103a = mVar;
    }

    public final void a(long j3) {
        if (this.f47105c && this.f47104b == j3) {
            return;
        }
        this.f47104b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f47105c = true;
        w1 w1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        AndroidUtilities.runOnUIThread(w1Var, 1000L);
    }

    public final void b() {
        this.f47105c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
