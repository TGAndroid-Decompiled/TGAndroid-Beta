package yh;

import org.telegram.messenger.cs;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.x1;
public final class c implements cs {
    public final int f54459a;
    public final x1 f54460b;
    public final long f54461c;
    public final boolean d;
    public final us e;

    public c(us usVar, x1 x1Var, long j10, boolean z10, int i10) {
        this.f54459a = i10;
        this.e = usVar;
        this.f54460b = x1Var;
        this.f54461c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f54459a) {
            case 0:
                e eVar = (e) this.e;
                eVar.getClass();
                this.f54460b.dismiss();
                if (j10 != 0) {
                    eVar.f54468b = -j10;
                    eVar.f54469c = eVar.getMessagesController().L0(Long.valueOf(j10));
                    eVar.a0(this.f54461c, this.d);
                    return;
                }
                return;
            default:
                a0 a0Var = (a0) this.e;
                a0Var.getClass();
                this.f54460b.dismiss();
                if (j10 != 0) {
                    a0Var.K0(vp.r1(a0Var.f21583a).L0(Long.valueOf(j10)), this.f54461c, this.d);
                    return;
                }
                return;
        }
    }
}
