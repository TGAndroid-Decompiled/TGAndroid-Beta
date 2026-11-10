package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.o00;
public final class v implements Runnable {
    public final int f56845a;
    public final i0 f56846b;

    public v(i0 i0Var, int i7) {
        this.f56845a = i7;
        this.f56846b = i0Var;
    }

    @Override
    public final void run() {
        String G;
        int i7 = this.f56845a;
        i0 i0Var = this.f56846b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.f27388a = true;
                    i0Var.F2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                i0Var.f56632s2.g(i0Var.W1, false);
                i0Var.t1();
                return;
            case 2:
                HashSet hashSet = i0Var.f56633t2;
                gc X = gc.X();
                if (X != null) {
                    if (hashSet.size() == 1) {
                        G = id.a0(null, null, 2131749143, g5.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = id.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    org.telegram.messenger.camera.q.s(G, X, 2131624345, 36);
                    return;
                }
                return;
            case 3:
                fi.d dVar = i0Var.N2;
                TLRPC.ChatFull N0 = qp.s1(i0Var.f28669a).N0(-i0Var.V1);
                dVar.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                return;
            default:
                if (t3.N(i0Var.n1())) {
                    if (i0Var.f56639z2.getParent() != null) {
                        ((ViewGroup) i0Var.f56639z2.getParent()).removeView(i0Var.f56639z2);
                    }
                    o00 o00Var = i0Var.G2;
                    if (o00Var != null && o00Var.getParent() != null) {
                        ((ViewGroup) i0Var.G2.getParent()).removeView(i0Var.G2);
                    }
                    i0Var.n1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
