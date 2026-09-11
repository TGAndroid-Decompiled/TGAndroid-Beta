package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
public final class c {
    public final b1 f44640a;
    public b f44642c = b.f44636a;
    public final org.telegram.ui.web.b d = new org.telegram.ui.web.b(this, 16);
    public final long f44641b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f44640a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f44642c != bVar) {
            org.telegram.ui.web.b bVar2 = this.d;
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.f44642c = bVar;
            if (z10) {
                this.f44640a.run(bVar);
            }
            if (bVar == b.f44637b || bVar == b.f44638c) {
                AndroidUtilities.runOnUIThread(bVar2, this.f44641b);
            }
        }
    }
}
