package qh;

import ig.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.a2;
public final class c {
    public final k0 f45143a;
    public b f45145c = b.f45140a;
    public final a2 d = new a2(this, 8);
    public final long f45144b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(k0 k0Var) {
        this.f45143a = k0Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f45145c != bVar) {
            a2 a2Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(a2Var);
            this.f45145c = bVar;
            if (z10) {
                this.f45143a.run(bVar);
            }
            if (bVar == b.f45141b || bVar == b.f45142c) {
                AndroidUtilities.runOnUIThread(a2Var, this.f45144b);
            }
        }
    }
}
