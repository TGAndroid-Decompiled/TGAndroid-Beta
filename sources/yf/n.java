package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.x1;
public final class n {
    public final m f52181a;
    public long f52182b;
    public boolean f52183c;
    public final x1 d = new x1(this, 24);

    public n(m mVar) {
        this.f52181a = mVar;
    }

    public final void a(long j3) {
        if (this.f52183c && this.f52182b == j3) {
            return;
        }
        this.f52182b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f52183c = true;
        x1 x1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(x1Var);
        AndroidUtilities.runOnUIThread(x1Var, 1000L);
    }

    public final void b() {
        this.f52183c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
