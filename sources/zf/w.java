package zf;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.yi0;
public final class w implements Runnable {
    public final int f50756a;
    public final j0 f50757b;

    public w(j0 j0Var, int i9) {
        this.f50756a = i9;
        this.f50757b = j0Var;
    }

    @Override
    public final void run() {
        int i9 = this.f50756a;
        j0 j0Var = this.f50757b;
        switch (i9) {
            case 0:
                if (LaunchActivity.R() != null) {
                    ?? obj = new Object();
                    obj.f23653a = true;
                    j0Var.G0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                j0Var.f50550t0.e(j0Var.X, false);
                j0Var.z1();
                return;
            case 2:
                HashSet hashSet = j0Var.f50551u0;
                oc X = oc.X();
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
                kh.d dVar = j0Var.O0;
                TLRPC.ChatFull t12 = j0Var.t1();
                dVar.c(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                return;
            default:
                if (ChatObject.hasAdminRights(j0Var.s1())) {
                    if (j0Var.A0.getParent() != null) {
                        ((ViewGroup) j0Var.A0.getParent()).removeView(j0Var.A0);
                    }
                    yi0 yi0Var = j0Var.H0;
                    if (yi0Var != null && yi0Var.getParent() != null) {
                        ((ViewGroup) j0Var.H0.getParent()).removeView(j0Var.H0);
                    }
                    j0Var.d.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
