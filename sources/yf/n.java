package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.q1;
public final class n {
    public final m f47121a;
    public long f47122b;
    public boolean f47123c;
    public final q1 d = new q1(this, 20);

    public n(m mVar) {
        this.f47121a = mVar;
    }

    public final void a(long j3) {
        if (this.f47123c && this.f47122b == j3) {
            return;
        }
        this.f47122b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f47123c = true;
        q1 q1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, 1000L);
    }

    public final void b() {
        this.f47123c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
