package sh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f47378a;
    public final j f47379b;

    public d(j jVar, int i10) {
        this.f47378a = i10;
        this.f47379b = jVar;
    }

    @Override
    public final void run() {
        int i10;
        String f10;
        int i11;
        switch (this.f47378a) {
            case 0:
                j jVar = this.f47379b;
                mh.n nVar = jVar.Q;
                if (jVar.V.end_date == 0) {
                    f10 = null;
                } else {
                    f10 = lg.n.f((i10 - jVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                nVar.f(f10, true);
                if (jVar.V.end_date != 0 && jVar.Y) {
                    AndroidUtilities.runOnUIThread(jVar.S, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                j jVar2 = this.f47379b;
                updatestarrefprogram.bot = jVar2.getMessagesController().getInputUser(jVar2.M);
                TL_payments.starRefProgram starrefprogram = jVar2.V;
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
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(jVar2.getParentActivity(), 3, null);
                d2Var.q(150L);
                jVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(jVar2, d2Var, 1));
                return;
            default:
                j jVar3 = this.f47379b;
                Activity parentActivity = jVar3.getParentActivity();
                if (!jVar3.T && jVar3.V.end_date == 0) {
                    i11 = R.string.AffiliateProgramStartInfoLink;
                } else {
                    i11 = R.string.AffiliateProgramUpdateInfoLink;
                }
                af.g.s(parentActivity, LocaleController.getString(i11));
                return;
        }
    }
}
