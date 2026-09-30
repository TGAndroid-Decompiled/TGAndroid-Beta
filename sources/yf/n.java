package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.q1;
public final class n {
    public final m f47124a;
    public long f47125b;
    public boolean f47126c;
    public final q1 d = new q1(this, 20);

    public n(m mVar) {
        this.f47124a = mVar;
    }

    public final void a(long j3) {
        if (this.f47126c && this.f47125b == j3) {
            return;
        }
        this.f47125b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f47126c = true;
        q1 q1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, 1000L);
    }

    public final void b() {
        this.f47126c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
