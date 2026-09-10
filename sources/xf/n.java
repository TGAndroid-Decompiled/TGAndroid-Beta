package xf;

import org.telegram.messenger.AndroidUtilities;
import qg.q0;
public final class n {
    public final m f45162a;
    public long f45163b;
    public boolean f45164c;
    public final q0 d = new q0(this, 26);

    public n(m mVar) {
        this.f45162a = mVar;
    }

    public final void a(long j3) {
        if (this.f45164c && this.f45163b == j3) {
            return;
        }
        this.f45163b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f45164c = true;
        q0 q0Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(q0Var);
        AndroidUtilities.runOnUIThread(q0Var, 1000L);
    }

    public final void b() {
        this.f45164c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
