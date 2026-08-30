package rh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f43487a;
    public final k f43488b;

    public d(k kVar, int i10) {
        this.f43487a = i10;
        this.f43488b = kVar;
    }

    @Override
    public final void run() {
        int i10;
        String f10;
        int i11;
        switch (this.f43487a) {
            case 0:
                k kVar = this.f43488b;
                lh.o oVar = kVar.Q;
                if (kVar.V.end_date == 0) {
                    f10 = null;
                } else {
                    f10 = kg.n.f((i10 - kVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                oVar.f(f10, true);
                if (kVar.V.end_date != 0 && kVar.Y) {
                    AndroidUtilities.runOnUIThread(kVar.S, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                k kVar2 = this.f43488b;
                updatestarrefprogram.bot = kVar2.getMessagesController().getInputUser(kVar2.M);
                TL_payments.starRefProgram starrefprogram = kVar2.V;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i12 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i12;
                if (i12 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i12 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i12 & (-2);
                }
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(kVar2.getParentActivity(), 3, null);
                d2Var.q(150L);
                kVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar2, d2Var, 1));
                return;
            default:
                k kVar3 = this.f43488b;
                Activity parentActivity = kVar3.getParentActivity();
                if (!kVar3.T && kVar3.V.end_date == 0) {
                    i11 = R.string.AffiliateProgramStartInfoLink;
                } else {
                    i11 = R.string.AffiliateProgramUpdateInfoLink;
                }
                af.g.s(parentActivity, LocaleController.getString(i11));
                return;
        }
    }
}
