package rg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.n50;
public final class w implements Runnable {
    public final int f42808a;
    public final j0 f42809b;

    public w(j0 j0Var, int i10) {
        this.f42808a = i10;
        this.f42809b = j0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42808a;
        j0 j0Var = this.f42809b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    ?? obj = new Object();
                    obj.f19581a = true;
                    j0Var.K0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                j0Var.f42616x0.e(j0Var.f42595b0, false);
                j0Var.z1();
                return;
            case 2:
                HashSet hashSet = j0Var.f42617y0;
                xc X = xc.X();
                if (X != null) {
                    if (hashSet.size() == 1) {
                        X.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) hashSet.iterator().next())))).j();
                        return;
                    } else {
                        X.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", hashSet.size(), Integer.valueOf(hashSet.size())))).j();
                        return;
                    }
                }
                return;
            case 3:
                ci.d dVar = j0Var.S0;
                TLRPC.ChatFull t12 = j0Var.t1();
                dVar.b(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                return;
            default:
                if (ChatObject.hasAdminRights(j0Var.s1())) {
                    if (j0Var.E0.getParent() != null) {
                        ((ViewGroup) j0Var.E0.getParent()).removeView(j0Var.E0);
                    }
                    n50 n50Var = j0Var.L0;
                    if (n50Var != null && n50Var.getParent() != null) {
                        ((ViewGroup) j0Var.L0.getParent()).removeView(j0Var.L0);
                    }
                    j0Var.d.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
