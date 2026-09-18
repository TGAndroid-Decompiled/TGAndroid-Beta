package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.w1;
public final class n {
    public final m f46874a;
    public long f46875b;
    public boolean f46876c;
    public final w1 d = new w1(this, 19);

    public n(m mVar) {
        this.f46874a = mVar;
    }

    public final void a(long j3) {
        if (this.f46876c && this.f46875b == j3) {
            return;
        }
        this.f46875b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f46876c = true;
        w1 w1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        AndroidUtilities.runOnUIThread(w1Var, 1000L);
    }

    public final void b() {
        this.f46876c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
