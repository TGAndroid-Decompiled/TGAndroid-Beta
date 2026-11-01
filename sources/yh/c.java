package yh;

import org.telegram.messenger.ds;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.ui.ActionBar.x1;
public final class c implements ds {
    public final int f54465a;
    public final x1 f54466b;
    public final long f54467c;
    public final boolean d;
    public final vs e;

    public c(vs vsVar, x1 x1Var, long j10, boolean z10, int i10) {
        this.f54465a = i10;
        this.e = vsVar;
        this.f54466b = x1Var;
        this.f54467c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f54465a) {
            case 0:
                e eVar = (e) this.e;
                eVar.getClass();
                this.f54466b.dismiss();
                if (j10 != 0) {
                    eVar.f54487b = -j10;
                    eVar.f54488c = eVar.getMessagesController().L0(Long.valueOf(j10));
                    eVar.b0(this.f54467c, this.d);
                    return;
                }
                return;
            default:
                z zVar = (z) this.e;
                zVar.getClass();
                this.f54466b.dismiss();
                if (j10 != 0) {
                    zVar.K0(wp.r1(zVar.f21584a).L0(Long.valueOf(j10)), this.f54467c, this.d);
                    return;
                }
                return;
        }
    }
}
