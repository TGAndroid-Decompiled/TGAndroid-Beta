package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.tv;
public final class v implements Runnable {
    public final int f59048a;
    public final k0 f59049b;

    public v(k0 k0Var, int i7) {
        this.f59048a = i7;
        this.f59049b = k0Var;
    }

    @Override
    public final void run() {
        String G;
        int i7 = this.f59048a;
        k0 k0Var = this.f59049b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.f28948a = true;
                    k0Var.G2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                k0Var.f58866t2.g(k0Var.X1, false);
                k0Var.u1();
                return;
            case 2:
                HashSet hashSet = k0Var.f58867u2;
                kc Y = kc.Y();
                if (Y != null) {
                    if (hashSet.size() == 1) {
                        G = gd.a0(null, null, 2131748950, i5.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = gd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    m10.u(G, Y, 2131624346, 36);
                    return;
                }
                return;
            case 3:
                hi.e eVar = k0Var.O2;
                TLRPC.ChatFull P0 = mp.u1(k0Var.f30223a).P0(-k0Var.W1);
                eVar.c(Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0), false);
                return;
            default:
                if (v3.N(k0Var.o1())) {
                    if (k0Var.A2.getParent() != null) {
                        ((ViewGroup) k0Var.A2.getParent()).removeView(k0Var.A2);
                    }
                    tv tvVar = k0Var.H2;
                    if (tvVar != null && tvVar.getParent() != null) {
                        ((ViewGroup) k0Var.H2.getParent()).removeView(k0Var.H2);
                    }
                    k0Var.f39246o1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
