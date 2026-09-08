package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
public final class c {
    public final b1 f44668a;
    public b f44670c = b.f44664a;
    public final org.telegram.ui.web.b d = new org.telegram.ui.web.b(this, 16);
    public final long f44669b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(b1 b1Var) {
        this.f44668a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f44670c != bVar) {
            org.telegram.ui.web.b bVar2 = this.d;
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.f44670c = bVar;
            if (z10) {
                this.f44668a.run(bVar);
            }
            if (bVar == b.f44665b || bVar == b.f44666c) {
                AndroidUtilities.runOnUIThread(bVar2, this.f44669b);
            }
        }
    }
}
