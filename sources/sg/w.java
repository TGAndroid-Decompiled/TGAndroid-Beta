package sg;

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
import org.telegram.ui.v10;
public final class w implements Runnable {
    public final int f46471a;
    public final k0 f46472b;

    public w(k0 k0Var, int i10) {
        this.f46471a = i10;
        this.f46472b = k0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f46471a;
        k0 k0Var = this.f46472b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    ?? obj = new Object();
                    obj.f21556a = true;
                    k0Var.K0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                k0Var.f46308x0.e(k0Var.f46287b0, false);
                k0Var.A1();
                return;
            case 2:
                HashSet hashSet = k0Var.f46309y0;
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
                ei.d dVar = k0Var.S0;
                TLRPC.ChatFull u12 = k0Var.u1();
                dVar.b(Math.max(u12.boosts_unrestrict - u12.boosts_applied, 0), false);
                return;
            default:
                if (ChatObject.hasAdminRights(k0Var.t1())) {
                    if (k0Var.E0.getParent() != null) {
                        ((ViewGroup) k0Var.E0.getParent()).removeView(k0Var.E0);
                    }
                    v10 v10Var = k0Var.L0;
                    if (v10Var != null && v10Var.getParent() != null) {
                        ((ViewGroup) k0Var.L0.getParent()).removeView(k0Var.L0);
                    }
                    k0Var.d.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
