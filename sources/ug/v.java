package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rv;
public final class v implements Runnable {
    public final int f58345a;
    public final j0 f58346b;

    public v(j0 j0Var, int i7) {
        this.f58345a = i7;
        this.f58346b = j0Var;
    }

    @Override
    public final void run() {
        String G;
        int i7 = this.f58345a;
        j0 j0Var = this.f58346b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.f28476a = true;
                    j0Var.G2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                j0Var.f58148t2.g(j0Var.X1, false);
                j0Var.t1();
                return;
            case 2:
                HashSet hashSet = j0Var.f58149u2;
                cc X = cc.X();
                if (X != null) {
                    if (hashSet.size() == 1) {
                        G = hd.a0(null, null, 2131749143, g5.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = hd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    i20.t(G, X, 2131624346, 36);
                    return;
                }
                return;
            case 3:
                hi.d dVar = j0Var.O2;
                TLRPC.ChatFull N0 = np.s1(j0Var.f29679a).N0(-j0Var.W1);
                dVar.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                return;
            default:
                if (t3.N(j0Var.n1())) {
                    if (j0Var.A2.getParent() != null) {
                        ((ViewGroup) j0Var.A2.getParent()).removeView(j0Var.A2);
                    }
                    rv rvVar = j0Var.H2;
                    if (rvVar != null && rvVar.getParent() != null) {
                        ((ViewGroup) j0Var.H2.getParent()).removeView(j0Var.H2);
                    }
                    j0Var.f35931o1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
