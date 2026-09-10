package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.pc;
public final class u implements Runnable {
    public final int f48906a;
    public final o1 f48907b;

    public u(o1 o1Var, int i10) {
        this.f48906a = i10;
        this.f48907b = o1Var;
    }

    @Override
    public final void run() {
        switch (this.f48906a) {
            case 0:
                o1 o1Var = this.f48907b;
                if (o1Var.O != null && !o1Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.V);
                    o1Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = o1Var.O;
                    ConnectionsManager.getInstance(o1Var.N).sendRequestTyped(getgroupcallstars, new Object(), new bi.k6(25, o1Var, getgroupcallstars));
                    return;
                }
                return;
            case 1:
                o1 o1Var2 = this.f48907b;
                AndroidUtilities.cancelRunOnUIThread(o1Var2.f48667d0);
                pc pcVar = o1Var2.W;
                if (pcVar != null) {
                    pcVar.b();
                    o1Var2.W = null;
                }
                long j3 = o1Var2.R;
                if (j3 > 0) {
                    o1Var2.R = 0L;
                    o1Var2.S = true;
                    o1Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    return;
                }
                o1Var2.j();
                return;
            default:
                o1 o1Var3 = this.f48907b;
                o1Var3.e.N(true);
                o1Var3.f48672n.N(true);
                return;
        }
    }
}
