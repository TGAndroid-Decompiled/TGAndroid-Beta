package wg;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.z4;
public final class t implements z4, fu0, yg.f, yg.k {
    public final z f59931a;

    public t(z zVar) {
        this.f59931a = zVar;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        z zVar = this.f59931a;
        zVar.f59976i2 = i7 * 1000;
        zVar.l1(false, true);
    }

    @Override
    public void n(int i7) {
        String str;
        int i10;
        String N0;
        String str2;
        String G;
        z zVar = this.f59931a;
        int i11 = zVar.d2;
        int i12 = yg.d.f61358w;
        if (i11 == 2) {
            zVar.f59977j2 = i7;
        } else {
            zVar.f59978k2 = i7;
        }
        zVar.f59980m2.f61329a.c(zVar.g1(), true);
        if (zVar.d2 == 3) {
            zVar.l1(true, true);
        } else {
            zVar.l1(false, false);
        }
        xg.b bVar = zVar.f59971c2;
        int g12 = zVar.g1();
        for (int i13 = 0; i13 < bVar.f60602f.getChildCount(); i13++) {
            View childAt = bVar.f60602f.getChildAt(i13);
            if (childAt instanceof yg.x) {
                n6 n6Var = ((yg.x) childAt).f61411r;
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
                boolean V = v3.V(gVar.f61364x);
                if (gVar.f61365y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        N0 = gd.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i10 = 2131751378;
                        } else {
                            i10 = 2131754876;
                        }
                        N0 = gd.N0(i10, null);
                    }
                    gVar.setSubtitle(N0);
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
        bVar.k(bVar.f60601e.size() - 12, 12);
    }

    @Override
    public void o() {
    }
}
