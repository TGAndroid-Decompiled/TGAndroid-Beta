package xg;

import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.tt0;
public final class u implements r4, tt0, zg.f, zg.k {
    public final a0 f58763a;

    public u(a0 a0Var) {
        this.f58763a = a0Var;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        a0 a0Var = this.f58763a;
        a0Var.f58636f2 = i3 * 1000;
        a0Var.k1(false, true);
    }

    @Override
    public void l(int i3) {
        String str;
        int i10;
        String M0;
        String str2;
        String G;
        a0 a0Var = this.f58763a;
        int i11 = a0Var.f58632a2;
        int i12 = zg.d.f60490w;
        if (i11 == 2) {
            a0Var.f58637g2 = i3;
        } else {
            a0Var.f58638h2 = i3;
        }
        a0Var.f58640j2.f60461a.c(a0Var.f1(), true);
        if (a0Var.f58632a2 == 3) {
            a0Var.k1(true, true);
        } else {
            a0Var.k1(false, false);
        }
        yg.b bVar = a0Var.Z1;
        int f12 = a0Var.f1();
        for (int i13 = 0; i13 < bVar.f59432f.getChildCount(); i13++) {
            View childAt = bVar.f59432f.getChildAt(i13);
            if (childAt instanceof zg.x) {
                h6 h6Var = ((zg.x) childAt).f60543r;
                if (f12 <= 0) {
                    G = "";
                } else {
                    G = bd.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                }
                h6Var.a();
                h6Var.c(G, true, true);
            }
            if (childAt instanceof zg.g) {
                zg.g gVar = (zg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean V = t3.V(gVar.f60496x);
                if (gVar.f60497y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        M0 = bd.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i10 = 2131751391;
                        } else {
                            i10 = 2131754876;
                        }
                        M0 = bd.M0(i10, null);
                    }
                    gVar.setSubtitle(M0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    gVar.setSubtitle(bd.G(f12, str, new Object[0]));
                }
            }
        }
        bVar.g(8);
        bVar.k(bVar.f59431e.size() - 12, 12);
    }

    @Override
    public void p() {
    }
}
