package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.u0;
public final class c {
    public final b1 f41057a;
    public b f41059c = b.f41054a;
    public final u0 d = new u0(this, 13);
    public final long f41058b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f41057a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41059c != bVar) {
            u0 u0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            this.f41059c = bVar;
            if (z10) {
                this.f41057a.run(bVar);
            }
            if (bVar == b.f41055b || bVar == b.f41056c) {
                AndroidUtilities.runOnUIThread(u0Var, this.f41058b);
            }
        }
    }
}
