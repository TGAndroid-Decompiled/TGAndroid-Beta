package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.x1;
public final class n {
    public final m f52304a;
    public long f52305b;
    public boolean f52306c;
    public final x1 d = new x1(this, 24);

    public n(m mVar) {
        this.f52304a = mVar;
    }

    public final void a(long j3) {
        if (this.f52306c && this.f52305b == j3) {
            return;
        }
        this.f52305b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f52306c = true;
        x1 x1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(x1Var);
        AndroidUtilities.runOnUIThread(x1Var, 1000L);
    }

    public final void b() {
        this.f52306c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
