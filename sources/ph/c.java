package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.u0;
public final class c {
    public final b1 f41084a;
    public b f41086c = b.f41081a;
    public final u0 d = new u0(this, 13);
    public final long f41085b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f41084a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41086c != bVar) {
            u0 u0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            this.f41086c = bVar;
            if (z10) {
                this.f41084a.run(bVar);
            }
            if (bVar == b.f41082b || bVar == b.f41083c) {
                AndroidUtilities.runOnUIThread(u0Var, this.f41085b);
            }
        }
    }
}
