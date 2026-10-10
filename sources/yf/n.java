package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.x1;
public final class n {
    public final m f52227a;
    public long f52228b;
    public boolean f52229c;
    public final x1 d = new x1(this, 24);

    public n(m mVar) {
        this.f52227a = mVar;
    }

    public final void a(long j3) {
        if (this.f52229c && this.f52228b == j3) {
            return;
        }
        this.f52228b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f52229c = true;
        x1 x1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(x1Var);
        AndroidUtilities.runOnUIThread(x1Var, 1000L);
    }

    public final void b() {
        this.f52229c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
