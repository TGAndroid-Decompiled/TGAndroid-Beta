package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.q0;
public final class c {
    public final q1 f45861a;
    public b f45863c = b.f45857a;
    public final q0 d = new q0(this, 14);
    public final long f45862b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f45861a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f45863c != bVar) {
            q0 q0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            this.f45863c = bVar;
            if (z10) {
                this.f45861a.run(bVar);
            }
            if (bVar == b.f45858b || bVar == b.f45859c) {
                AndroidUtilities.runOnUIThread(q0Var, this.f45862b);
            }
        }
    }
}
