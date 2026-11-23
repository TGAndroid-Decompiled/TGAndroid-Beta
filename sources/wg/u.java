package wg;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.o6;
public final class u implements a5, gu0, yg.f, yg.k {
    public final a0 f59871a;

    public u(a0 a0Var) {
        this.f59871a = a0Var;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        a0 a0Var = this.f59871a;
        a0Var.f59745i2 = i7 * 1000;
        a0Var.l1(false, true);
    }

    @Override
    public void k(int i7) {
        String str;
        int i10;
        String N0;
        String str2;
        String G;
        a0 a0Var = this.f59871a;
        int i11 = a0Var.d2;
        int i12 = yg.d.f61274w;
        if (i11 == 2) {
            a0Var.f59746j2 = i7;
        } else {
            a0Var.f59747k2 = i7;
        }
        a0Var.f59749m2.f61245a.c(a0Var.g1(), true);
        if (a0Var.d2 == 3) {
            a0Var.l1(true, true);
        } else {
            a0Var.l1(false, false);
        }
        xg.b bVar = a0Var.f59740c2;
        int g12 = a0Var.g1();
        for (int i13 = 0; i13 < bVar.f60519f.getChildCount(); i13++) {
            View childAt = bVar.f60519f.getChildAt(i13);
            if (childAt instanceof yg.x) {
                o6 o6Var = ((yg.x) childAt).f61327r;
                if (g12 <= 0) {
                    G = "";
                } else {
                    G = hd.G(g12, "BoostingBoostsCountTitle", Integer.valueOf(g12));
                }
                o6Var.a();
                o6Var.c(G, true, true);
            }
            if (childAt instanceof yg.g) {
                yg.g gVar = (yg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean V = v3.V(gVar.f61280x);
                if (gVar.f61281y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        N0 = hd.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i10 = 2131751378;
                        } else {
                            i10 = 2131754876;
                        }
                        N0 = hd.N0(i10, null);
                    }
                    gVar.setSubtitle(N0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    gVar.setSubtitle(hd.G(g12, str, new Object[0]));
                }
            }
        }
        bVar.g(8);
        bVar.k(bVar.f60518e.size() - 12, 12);
    }

    @Override
    public void o() {
    }
}
