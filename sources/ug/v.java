package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.uv;
public final class v implements Runnable {
    public final int f58967a;
    public final k0 f58968b;

    public v(k0 k0Var, int i7) {
        this.f58967a = i7;
        this.f58968b = k0Var;
    }

    @Override
    public final void run() {
        String G;
        int i7 = this.f58967a;
        k0 k0Var = this.f58968b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.f28905a = true;
                    k0Var.G2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                k0Var.f58786t2.g(k0Var.X1, false);
                k0Var.u1();
                return;
            case 2:
                HashSet hashSet = k0Var.f58787u2;
                lc Y = lc.Y();
                if (Y != null) {
                    if (hashSet.size() == 1) {
                        G = hd.a0(null, null, 2131748950, i5.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = hd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    o10.u(G, Y, 2131624346, 36);
                    return;
                }
                return;
            case 3:
                hi.e eVar = k0Var.O2;
                TLRPC.ChatFull P0 = np.u1(k0Var.f30173a).P0(-k0Var.W1);
                eVar.c(Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0), false);
                return;
            default:
                if (v3.N(k0Var.o1())) {
                    if (k0Var.A2.getParent() != null) {
                        ((ViewGroup) k0Var.A2.getParent()).removeView(k0Var.A2);
                    }
                    uv uvVar = k0Var.H2;
                    if (uvVar != null && uvVar.getParent() != null) {
                        ((ViewGroup) k0Var.H2.getParent()).removeView(k0Var.H2);
                    }
                    k0Var.f39531o1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
