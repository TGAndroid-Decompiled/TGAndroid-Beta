package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
public final class c {
    public final b1 f44669a;
    public b f44671c = b.f44665a;
    public final org.telegram.ui.web.b d = new org.telegram.ui.web.b(this, 16);
    public final long f44670b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f44669a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f44671c != bVar) {
            org.telegram.ui.web.b bVar2 = this.d;
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.f44671c = bVar;
            if (z10) {
                this.f44669a.run(bVar);
            }
            if (bVar == b.f44666b || bVar == b.f44667c) {
                AndroidUtilities.runOnUIThread(bVar2, this.f44670b);
            }
        }
    }
}
