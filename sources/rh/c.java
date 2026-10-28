package rh;

import ig.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.h1;
public final class c {
    public final o f47646a;
    public b f47648c = b.f47643a;
    public final h1 d = new h1(this, 13);
    public final long f47647b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(o oVar) {
        this.f47646a = oVar;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f47648c != bVar) {
            h1 h1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(h1Var);
            this.f47648c = bVar;
            if (z10) {
                this.f47646a.run(bVar);
            }
            if (bVar == b.f47644b || bVar == b.f47645c) {
                AndroidUtilities.runOnUIThread(h1Var, this.f47647b);
            }
        }
    }
}
