package th;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.wb;
public final class u implements Runnable {
    public final int f49514a;
    public final p1 f49515b;

    public u(p1 p1Var, int i10) {
        this.f49514a = i10;
        this.f49515b = p1Var;
    }

    @Override
    public final void run() {
        switch (this.f49514a) {
            case 0:
                p1 p1Var = this.f49515b;
                if (p1Var.O != null && !p1Var.U) {
                    org.telegram.messenger.i0.r(p1Var.V);
                    p1Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = p1Var.O;
                    ConnectionsManager.getInstance(p1Var.N).sendRequestTyped(getgroupcallstars, new a3.b(1), new rh.s6(3, p1Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                p1 p1Var2 = this.f49515b;
                org.telegram.messenger.i0.r(p1Var2.f49099d0);
                wb wbVar = p1Var2.W;
                if (wbVar != null) {
                    wbVar.b();
                    p1Var2.W = null;
                }
                long j10 = p1Var2.R;
                if (j10 > 0) {
                    p1Var2.R = 0L;
                    p1Var2.S = true;
                    p1Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    return;
                }
                p1Var2.j();
                return;
            default:
                p1 p1Var3 = this.f49515b;
                p1Var3.e.O(true);
                p1Var3.f49104n.O(true);
                return;
        }
    }
}
