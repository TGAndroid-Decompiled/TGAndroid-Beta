package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.t0;
public final class c {
    public final q1 f41009a;
    public b f41011c = b.f41006a;
    public final t0 d = new t0(this, 13);
    public final long f41010b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f41009a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41011c != bVar) {
            t0 t0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(t0Var);
            this.f41011c = bVar;
            if (z10) {
                this.f41009a.run(bVar);
            }
            if (bVar == b.f41007b || bVar == b.f41008c) {
                AndroidUtilities.runOnUIThread(t0Var, this.f41010b);
            }
        }
    }
}
