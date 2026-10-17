package qh;

import ig.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.z1;
public final class c {
    public final l0 f44745a;
    public b f44747c = b.f44742a;
    public final z1 d = new z1(this, 8);
    public final long f44746b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(l0 l0Var) {
        this.f44745a = l0Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f44747c != bVar) {
            z1 z1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(z1Var);
            this.f44747c = bVar;
            if (z10) {
                this.f44745a.run(bVar);
            }
            if (bVar == b.f44743b || bVar == b.f44744c) {
                AndroidUtilities.runOnUIThread(z1Var, this.f44746b);
            }
        }
    }
}
