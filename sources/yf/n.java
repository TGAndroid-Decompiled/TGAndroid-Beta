package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.q1;
public final class n {
    public final m f47170a;
    public long f47171b;
    public boolean f47172c;
    public final q1 d = new q1(this, 20);

    public n(m mVar) {
        this.f47170a = mVar;
    }

    public final void a(long j3) {
        if (this.f47172c && this.f47171b == j3) {
            return;
        }
        this.f47171b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f47172c = true;
        q1 q1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, 1000L);
    }

    public final void b() {
        this.f47172c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
