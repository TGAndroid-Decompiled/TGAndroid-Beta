package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.uv;
public final class v implements Runnable {
    public final int f58925a;
    public final l0 f58926b;

    public v(l0 l0Var, int i7) {
        this.f58925a = i7;
        this.f58926b = l0Var;
    }

    @Override
    public final void run() {
        String G;
        int i7 = this.f58925a;
        l0 l0Var = this.f58926b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.f28923a = true;
                    l0Var.G2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                l0Var.f58746t2.g(l0Var.X1, false);
                l0Var.u1();
                return;
            case 2:
                HashSet hashSet = l0Var.f58747u2;
                lc Y = lc.Y();
                if (Y != null) {
                    if (hashSet.size() == 1) {
                        G = gd.a0(null, null, 2131748951, i5.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = gd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    n10.u(G, Y, 2131624346, 36);
                    return;
                }
                return;
            case 3:
                hi.d dVar = l0Var.O2;
                TLRPC.ChatFull P0 = mp.u1(l0Var.f30189a).P0(-l0Var.W1);
                dVar.c(Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0), false);
                return;
            default:
                if (v3.N(l0Var.o1())) {
                    if (l0Var.A2.getParent() != null) {
                        ((ViewGroup) l0Var.A2.getParent()).removeView(l0Var.A2);
                    }
                    uv uvVar = l0Var.H2;
                    if (uvVar != null && uvVar.getParent() != null) {
                        ((ViewGroup) l0Var.H2.getParent()).removeView(l0Var.H2);
                    }
                    l0Var.f39534o1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
