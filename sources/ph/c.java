package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.r0;
public final class c {
    public final b1 f41358a;
    public b f41360c = b.f41355a;
    public final r0 d = new r0(this, 14);
    public final long f41359b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f41358a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41360c != bVar) {
            r0 r0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(r0Var);
            this.f41360c = bVar;
            if (z10) {
                this.f41358a.run(bVar);
            }
            if (bVar == b.f41356b || bVar == b.f41357c) {
                AndroidUtilities.runOnUIThread(r0Var, this.f41359b);
            }
        }
    }
}
