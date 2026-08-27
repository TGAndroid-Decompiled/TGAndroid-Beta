package yg;

import lh.n6;
import org.telegram.messenger.AndroidUtilities;

public final class c {

    public final n6 f50145a;

    public b f50147c = b.f50141a;
    public final qf.b d = new qf.b(this, 23);

    public final long f50146b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(n6 n6Var) {
        this.f50145a = n6Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f50147c != bVar) {
            qf.b bVar2 = this.d;
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.f50147c = bVar;
            if (z10) {
                this.f50145a.run(bVar);
            }
            if (bVar == b.f50142b || bVar == b.f50143c) {
                AndroidUtilities.runOnUIThread(bVar2, this.f50146b);
            }
        }
    }
}
