package vg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class v implements Runnable {
    public final int f56872a;
    public final i0 f56873b;

    public v(i0 i0Var, int i3) {
        this.f56872a = i3;
        this.f56873b = i0Var;
    }

    @Override
    public final void run() {
        String G;
        int i3 = this.f56872a;
        i0 i0Var = this.f56873b;
        switch (i3) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    i0Var.D2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                i0Var.f56666q2.g(i0Var.U1, false);
                i0Var.t1();
                return;
            case 2:
                HashSet hashSet = i0Var.f56667r2;
                fc X = fc.X();
                if (X != null) {
                    if (hashSet.size() == 1) {
                        G = bd.a0(null, null, 2131749151, g5.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = bd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    org.telegram.messenger.camera.q.s(G, X, 2131624345, 36);
                    return;
                }
                return;
            case 3:
                gi.d dVar = i0Var.L2;
                TLRPC.ChatFull N0 = hp.s1(i0Var.f28583a).N0(-i0Var.T1);
                dVar.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                return;
            default:
                if (t3.N(i0Var.n1())) {
                    if (i0Var.f56673x2.getParent() != null) {
                        ((ViewGroup) i0Var.f56673x2.getParent()).removeView(i0Var.f56673x2);
                    }
                    org.telegram.ui.Components.voip.r0 r0Var = i0Var.E2;
                    if (r0Var != null && r0Var.getParent() != null) {
                        ((ViewGroup) i0Var.E2.getParent()).removeView(i0Var.E2);
                    }
                    i0Var.f36102l1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
