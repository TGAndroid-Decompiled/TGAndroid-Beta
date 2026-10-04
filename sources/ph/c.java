package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.u0;
public final class c {
    public final q1 f44704a;
    public b f44706c = b.f44700a;
    public final u0 d = new u0(this, 13);
    public final long f44705b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f44704a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f44706c != bVar) {
            u0 u0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            this.f44706c = bVar;
            if (z10) {
                this.f44704a.run(bVar);
            }
            if (bVar == b.f44701b || bVar == b.f44702c) {
                AndroidUtilities.runOnUIThread(u0Var, this.f44705b);
            }
        }
    }
}
