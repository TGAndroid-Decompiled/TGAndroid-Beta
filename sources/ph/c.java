package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.u0;
public final class c {
    public final q1 f41329a;
    public b f41331c = b.f41326a;
    public final u0 d = new u0(this, 13);
    public final long f41330b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f41329a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41331c != bVar) {
            u0 u0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            this.f41331c = bVar;
            if (z10) {
                this.f41329a.run(bVar);
            }
            if (bVar == b.f41327b || bVar == b.f41328c) {
                AndroidUtilities.runOnUIThread(u0Var, this.f41330b);
            }
        }
    }
}
