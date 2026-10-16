package qh;

import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.voip.r2;
public final class c {
    public final p1 f43372a;
    public b f43374c = b.f43369a;
    public final r2 d = new r2(this, 19);
    public final long f43373b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(p1 p1Var) {
        this.f43372a = p1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f43374c != bVar) {
            r2 r2Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(r2Var);
            this.f43374c = bVar;
            if (z10) {
                this.f43372a.run(bVar);
            }
            if (bVar == b.f43370b || bVar == b.f43371c) {
                AndroidUtilities.runOnUIThread(r2Var, this.f43373b);
            }
        }
    }
}
