package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.l00;
public final class v implements Runnable {
    public final int f56833a;
    public final i0 f56834b;

    public v(i0 i0Var, int i7) {
        this.f56833a = i7;
        this.f56834b = i0Var;
    }

    @Override
    public final void run() {
        String G;
        int i7 = this.f56833a;
        i0 i0Var = this.f56834b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.f27424a = true;
                    i0Var.C2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                i0Var.f56617p2.g(i0Var.T1, false);
                i0Var.t1();
                return;
            case 2:
                HashSet hashSet = i0Var.f56618q2;
                hc X = hc.X();
                if (X != null) {
                    if (hashSet.size() == 1) {
                        G = id.a0(null, null, 2131749144, g5.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = id.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    org.telegram.messenger.camera.q.s(G, X, 2131624345, 36);
                    return;
                }
                return;
            case 3:
                fi.d dVar = i0Var.K2;
                TLRPC.ChatFull N0 = qp.s1(i0Var.f28616a).N0(-i0Var.S1);
                dVar.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                return;
            default:
                if (t3.N(i0Var.n1())) {
                    if (i0Var.f56624w2.getParent() != null) {
                        ((ViewGroup) i0Var.f56624w2.getParent()).removeView(i0Var.f56624w2);
                    }
                    l00 l00Var = i0Var.D2;
                    if (l00Var != null && l00Var.getParent() != null) {
                        ((ViewGroup) i0Var.D2.getParent()).removeView(i0Var.D2);
                    }
                    i0Var.f36277k1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
