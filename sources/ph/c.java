package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.u0;
public final class c {
    public final b1 f41317a;
    public b f41319c = b.f41314a;
    public final u0 d = new u0(this, 13);
    public final long f41318b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f41317a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f41319c != bVar) {
            u0 u0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            this.f41319c = bVar;
            if (z10) {
                this.f41317a.run(bVar);
            }
            if (bVar == b.f41315b || bVar == b.f41316c) {
                AndroidUtilities.runOnUIThread(u0Var, this.f41318b);
            }
        }
    }
}
