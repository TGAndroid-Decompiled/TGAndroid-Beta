package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.t0;
public final class c {
    public final q1 f45897a;
    public b f45899c = b.f45893a;
    public final t0 d = new t0(this, 13);
    public final long f45898b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f45897a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f45899c != bVar) {
            t0 t0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(t0Var);
            this.f45899c = bVar;
            if (z10) {
                this.f45897a.run(bVar);
            }
            if (bVar == b.f45894b || bVar == b.f45895c) {
                AndroidUtilities.runOnUIThread(t0Var, this.f45898b);
            }
        }
    }
}
