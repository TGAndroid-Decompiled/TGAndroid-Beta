package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.q0;
public final class c {
    public final q1 f41317a;
    public b f41319c = b.f41314a;
    public final q0 d = new q0(this, 14);
    public final long f41318b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f41317a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41319c != bVar) {
            q0 q0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            this.f41319c = bVar;
            if (z10) {
                this.f41317a.run(bVar);
            }
            if (bVar == b.f41315b || bVar == b.f41316c) {
                AndroidUtilities.runOnUIThread(q0Var, this.f41318b);
            }
        }
    }
}
