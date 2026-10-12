package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.x1;
public final class n {
    public final m f52415a;
    public long f52416b;
    public boolean f52417c;
    public final x1 d = new x1(this, 24);

    public n(m mVar) {
        this.f52415a = mVar;
    }

    public final void a(long j3) {
        if (this.f52417c && this.f52416b == j3) {
            return;
        }
        this.f52416b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f52417c = true;
        x1 x1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(x1Var);
        AndroidUtilities.runOnUIThread(x1Var, 1000L);
    }

    public final void b() {
        this.f52417c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
