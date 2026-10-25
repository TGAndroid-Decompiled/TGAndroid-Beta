package rh;

import ig.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.h1;
public final class c {
    public final o f47608a;
    public b f47610c = b.f47605a;
    public final h1 d = new h1(this, 13);
    public final long f47609b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(o oVar) {
        this.f47608a = oVar;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f47610c != bVar) {
            h1 h1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(h1Var);
            this.f47610c = bVar;
            if (z10) {
                this.f47608a.run(bVar);
            }
            if (bVar == b.f47606b || bVar == b.f47607c) {
                AndroidUtilities.runOnUIThread(h1Var, this.f47609b);
            }
        }
    }
}
