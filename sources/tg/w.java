package tg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.z10;
public final class w implements Runnable {
    public final int f49086a;
    public final j0 f49087b;

    public w(j0 j0Var, int i10) {
        this.f49086a = i10;
        this.f49087b = j0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f49086a;
        j0 j0Var = this.f49087b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    ?? obj = new Object();
                    obj.f22928a = true;
                    j0Var.K0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                j0Var.f48906x0.g(j0Var.f48885b0, false);
                j0Var.D1();
                return;
            case 2:
                HashSet hashSet = j0Var.f48907y0;
                wc Y = wc.Y();
                if (Y != null) {
                    if (hashSet.size() == 1) {
                        Y.R(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) hashSet.iterator().next())))).j();
                        return;
                    } else {
                        Y.R(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", hashSet.size(), Integer.valueOf(hashSet.size())))).j();
                        return;
                    }
                }
                return;
            case 3:
                fi.d dVar = j0Var.S0;
                TLRPC.ChatFull x12 = j0Var.x1();
                dVar.b(Math.max(x12.boosts_unrestrict - x12.boosts_applied, 0), false);
                return;
            default:
                if (ChatObject.hasAdminRights(j0Var.w1())) {
                    if (j0Var.E0.getParent() != null) {
                        ((ViewGroup) j0Var.E0.getParent()).removeView(j0Var.E0);
                    }
                    z10 z10Var = j0Var.L0;
                    if (z10Var != null && z10Var.getParent() != null) {
                        ((ViewGroup) j0Var.L0.getParent()).removeView(j0Var.L0);
                    }
                    j0Var.d.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
