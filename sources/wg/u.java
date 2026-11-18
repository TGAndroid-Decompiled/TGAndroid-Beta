package wg;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.z4;
public final class u implements z4, du0, yg.f, yg.k {
    public final a0 f59826a;

    public u(a0 a0Var) {
        this.f59826a = a0Var;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        a0 a0Var = this.f59826a;
        a0Var.f59703i2 = i7 * 1000;
        a0Var.l1(false, true);
    }

    @Override
    public void k(int i7) {
        String str;
        int i10;
        String M0;
        String str2;
        String G;
        a0 a0Var = this.f59826a;
        int i11 = a0Var.d2;
        int i12 = yg.d.f61229w;
        if (i11 == 2) {
            a0Var.f59704j2 = i7;
        } else {
            a0Var.f59705k2 = i7;
        }
        a0Var.f59707m2.f61200a.c(a0Var.g1(), true);
        if (a0Var.d2 == 3) {
            a0Var.l1(true, true);
        } else {
            a0Var.l1(false, false);
        }
        xg.b bVar = a0Var.f59698c2;
        int g12 = a0Var.g1();
        for (int i13 = 0; i13 < bVar.f60474f.getChildCount(); i13++) {
            View childAt = bVar.f60474f.getChildAt(i13);
            if (childAt instanceof yg.x) {
                n6 n6Var = ((yg.x) childAt).f61282r;
                if (g12 <= 0) {
                    G = "";
                } else {
                    G = gd.G(g12, "BoostingBoostsCountTitle", Integer.valueOf(g12));
                }
                n6Var.a();
                n6Var.c(G, true, true);
            }
            if (childAt instanceof yg.g) {
                yg.g gVar = (yg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean V = v3.V(gVar.f61235x);
                if (gVar.f61236y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        M0 = gd.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i10 = 2131751379;
                        } else {
                            i10 = 2131754876;
                        }
                        M0 = gd.M0(i10, null);
                    }
                    gVar.setSubtitle(M0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    gVar.setSubtitle(gd.G(g12, str, new Object[0]));
                }
            }
        }
        bVar.g(8);
        bVar.k(bVar.f60473e.size() - 12, 12);
    }

    @Override
    public void o() {
    }
}
