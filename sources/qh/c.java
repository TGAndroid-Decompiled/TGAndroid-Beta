package qh;

import ig.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.z1;
public final class c {
    public final l0 f44720a;
    public b f44722c = b.f44717a;
    public final z1 d = new z1(this, 8);
    public final long f44721b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(l0 l0Var) {
        this.f44720a = l0Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f44722c != bVar) {
            z1 z1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(z1Var);
            this.f44722c = bVar;
            if (z10) {
                this.f44720a.run(bVar);
            }
            if (bVar == b.f44718b || bVar == b.f44719c) {
                AndroidUtilities.runOnUIThread(z1Var, this.f44721b);
            }
        }
    }
}
