package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.u0;
public final class c {
    public final b1 f41053a;
    public b f41055c = b.f41050a;
    public final u0 d = new u0(this, 13);
    public final long f41054b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f41053a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41055c != bVar) {
            u0 u0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            this.f41055c = bVar;
            if (z10) {
                this.f41053a.run(bVar);
            }
            if (bVar == b.f41051b || bVar == b.f41052c) {
                AndroidUtilities.runOnUIThread(u0Var, this.f41054b);
            }
        }
    }
}
