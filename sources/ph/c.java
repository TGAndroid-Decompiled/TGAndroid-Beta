package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.q0;
public final class c {
    public final q1 f41331a;
    public b f41333c = b.f41328a;
    public final q0 d = new q0(this, 14);
    public final long f41332b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f41331a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41333c != bVar) {
            q0 q0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            this.f41333c = bVar;
            if (z10) {
                this.f41331a.run(bVar);
            }
            if (bVar == b.f41329b || bVar == b.f41330c) {
                AndroidUtilities.runOnUIThread(q0Var, this.f41332b);
            }
        }
    }
}
