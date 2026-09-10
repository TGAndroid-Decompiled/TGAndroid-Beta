package qg;

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
import org.telegram.ui.t50;
public final class x implements Runnable {
    public final int f40977a;
    public final k0 f40978b;

    public x(k0 k0Var, int i10) {
        this.f40977a = i10;
        this.f40978b = k0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40977a;
        k0 k0Var = this.f40978b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    ?? obj = new Object();
                    obj.f18485a = true;
                    k0Var.K0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                k0Var.f40786x0.e(k0Var.f40765b0, false);
                k0Var.z1();
                return;
            case 2:
                HashSet hashSet = k0Var.f40787y0;
                wc X = wc.X();
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
                bi.d dVar = k0Var.S0;
                TLRPC.ChatFull t12 = k0Var.t1();
                dVar.b(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                return;
            default:
                if (ChatObject.hasAdminRights(k0Var.s1())) {
                    if (k0Var.E0.getParent() != null) {
                        ((ViewGroup) k0Var.E0.getParent()).removeView(k0Var.E0);
                    }
                    t50 t50Var = k0Var.L0;
                    if (t50Var != null && t50Var.getParent() != null) {
                        ((ViewGroup) k0Var.L0.getParent()).removeView(k0Var.L0);
                    }
                    k0Var.d.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
