package sg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.e50;
public final class w implements Runnable {
    public final int f46905a;
    public final j0 f46906b;

    public w(j0 j0Var, int i10) {
        this.f46905a = i10;
        this.f46906b = j0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f46905a;
        j0 j0Var = this.f46906b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    ?? obj = new Object();
                    obj.f21637a = true;
                    j0Var.K0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                j0Var.f46727x0.g(j0Var.f46706b0, false);
                j0Var.D1();
                return;
            case 2:
                HashSet hashSet = j0Var.f46728y0;
                vc X = vc.X();
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
                ei.d dVar = j0Var.S0;
                TLRPC.ChatFull x12 = j0Var.x1();
                dVar.b(Math.max(x12.boosts_unrestrict - x12.boosts_applied, 0), false);
                return;
            default:
                if (ChatObject.hasAdminRights(j0Var.w1())) {
                    if (j0Var.E0.getParent() != null) {
                        ((ViewGroup) j0Var.E0.getParent()).removeView(j0Var.E0);
                    }
                    e50 e50Var = j0Var.L0;
                    if (e50Var != null && e50Var.getParent() != null) {
                        ((ViewGroup) j0Var.L0.getParent()).removeView(j0Var.L0);
                    }
                    j0Var.d.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
