package ph;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f45755a;
    public final j f45756b;

    public d(j jVar, int i10) {
        this.f45755a = i10;
        this.f45756b = jVar;
    }

    @Override
    public final void run() {
        int i10;
        String f9;
        int i11;
        switch (this.f45755a) {
            case 0:
                j jVar = this.f45756b;
                jh.n nVar = jVar.P;
                if (jVar.U.end_date == 0) {
                    f9 = null;
                } else {
                    f9 = ig.n.f((i10 - jVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                nVar.f(f9, true);
                if (jVar.U.end_date != 0 && jVar.X) {
                    AndroidUtilities.runOnUIThread(jVar.R, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                j jVar2 = this.f45756b;
                updatestarrefprogram.bot = jVar2.getMessagesController().getInputUser(jVar2.L);
                TL_payments.starRefProgram starrefprogram = jVar2.U;
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
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(jVar2.getParentActivity(), 3, null);
                c2Var.q(150L);
                jVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(jVar2, c2Var, 1));
                return;
            default:
                j jVar3 = this.f45756b;
                Activity parentActivity = jVar3.getParentActivity();
                if (!jVar3.S && jVar3.U.end_date == 0) {
                    i11 = R.string.AffiliateProgramStartInfoLink;
                } else {
                    i11 = R.string.AffiliateProgramUpdateInfoLink;
                }
                ye.d.s(parentActivity, LocaleController.getString(i11));
                return;
        }
    }
}
