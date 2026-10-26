package rh;

import ig.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.h1;
public final class c {
    public final o f47611a;
    public b f47613c = b.f47608a;
    public final h1 d = new h1(this, 13);
    public final long f47612b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(o oVar) {
        this.f47611a = oVar;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f47613c != bVar) {
            h1 h1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(h1Var);
            this.f47613c = bVar;
            if (z10) {
                this.f47611a.run(bVar);
            }
            if (bVar == b.f47609b || bVar == b.f47610c) {
                AndroidUtilities.runOnUIThread(h1Var, this.f47612b);
            }
        }
    }
}
