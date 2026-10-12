package qh;

import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.voip.m2;
public final class c {
    public final p1 f43630a;
    public b f43632c = b.f43627a;
    public final m2 d = new m2(this, 19);
    public final long f43631b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(p1 p1Var) {
        this.f43630a = p1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f43632c != bVar) {
            m2 m2Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
            this.f43632c = bVar;
            if (z10) {
                this.f43630a.run(bVar);
            }
            if (bVar == b.f43628b || bVar == b.f43629c) {
                AndroidUtilities.runOnUIThread(m2Var, this.f43631b);
            }
        }
    }
}
