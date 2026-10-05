package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.u0;
public final class c {
    public final q1 f44719a;
    public b f44721c = b.f44715a;
    public final u0 d = new u0(this, 13);
    public final long f44720b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(q1 q1Var) {
        this.f44719a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f44721c != bVar) {
            u0 u0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            this.f44721c = bVar;
            if (z10) {
                this.f44719a.run(bVar);
            }
            if (bVar == b.f44716b || bVar == b.f44717c) {
                AndroidUtilities.runOnUIThread(u0Var, this.f44720b);
            }
        }
    }
}
