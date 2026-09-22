package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.r0;
public final class c {
    public final b1 f41380a;
    public b f41382c = b.f41377a;
    public final r0 d = new r0(this, 14);
    public final long f41381b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f41380a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41382c != bVar) {
            r0 r0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(r0Var);
            this.f41382c = bVar;
            if (z10) {
                this.f41380a.run(bVar);
            }
            if (bVar == b.f41378b || bVar == b.f41379c) {
                AndroidUtilities.runOnUIThread(r0Var, this.f41381b);
            }
        }
    }
}
