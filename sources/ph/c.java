package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.t0;
public final class c {
    public final q1 f45931a;
    public b f45933c = b.f45927a;
    public final t0 d = new t0(this, 13);
    public final long f45932b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f45931a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f45933c != bVar) {
            t0 t0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(t0Var);
            this.f45933c = bVar;
            if (z10) {
                this.f45931a.run(bVar);
            }
            if (bVar == b.f45928b || bVar == b.f45929c) {
                AndroidUtilities.runOnUIThread(t0Var, this.f45932b);
            }
        }
    }
}
