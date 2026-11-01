package xh;

import android.app.Activity;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f53740a;
    public final i f53741b;

    public d(i iVar, int i10) {
        this.f53740a = i10;
        this.f53741b = iVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12 = this.f53740a;
        String str = null;
        i iVar = this.f53741b;
        switch (i12) {
            case 0:
                ph.i iVar2 = iVar.V;
                if (iVar.f53805a0.end_date != 0) {
                    str = qg.k.f((i10 - iVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                iVar2.g(str, true);
                if (iVar.f53805a0.end_date != 0 && iVar.f53808d0) {
                    org.telegram.messenger.i0.h3(iVar.X, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = iVar.getMessagesController().n1(iVar.R);
                TL_payments.starRefProgram starrefprogram = iVar.f53805a0;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i13 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i13;
                if (i13 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i13 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i13 & (-2);
                }
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, iVar.getParentActivity(), null);
                x1Var.r(150L);
                iVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(iVar, x1Var, 1));
                return;
            default:
                Activity parentActivity = iVar.getParentActivity();
                if (!iVar.Y && iVar.f53805a0.end_date == 0) {
                    i11 = 2131754327;
                } else {
                    i11 = 2131754314;
                }
                gf.f.r(parentActivity, dd.L0(i11, null));
                return;
        }
    }
}
