package xg;

import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import pf.o1;
public final class c {
    public final i9 f49432a;
    public b f49434c = b.f49428a;
    public final o1 d = new o1(this, 15);
    public final long f49433b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(i9 i9Var) {
        this.f49432a = i9Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f49434c != bVar) {
            o1 o1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(o1Var);
            this.f49434c = bVar;
            if (z10) {
                this.f49432a.run(bVar);
            }
            if (bVar == b.f49429b || bVar == b.f49430c) {
                AndroidUtilities.runOnUIThread(o1Var, this.f49433b);
            }
        }
    }
}
