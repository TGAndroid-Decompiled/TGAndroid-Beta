package wg;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.vt0;
public final class t implements s4, vt0, yg.f, yg.k {
    public final z f57805a;

    public t(z zVar) {
        this.f57805a = zVar;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        z zVar = this.f57805a;
        zVar.f57847h2 = i7 * 1000;
        zVar.k1(false, true);
    }

    @Override
    public void m(int i7) {
        String str;
        int i10;
        String M0;
        String str2;
        String G;
        z zVar = this.f57805a;
        int i11 = zVar.f57843c2;
        int i12 = yg.d.f59457w;
        if (i11 == 2) {
            zVar.f57848i2 = i7;
        } else {
            zVar.f57849j2 = i7;
        }
        zVar.f57851l2.f59428a.c(zVar.f1(), true);
        if (zVar.f57843c2 == 3) {
            zVar.k1(true, true);
        } else {
            zVar.k1(false, false);
        }
        xg.c cVar = zVar.f57842b2;
        int f12 = zVar.f1();
        for (int i13 = 0; i13 < cVar.f58722f.getChildCount(); i13++) {
            View childAt = cVar.f58722f.getChildAt(i13);
            if (childAt instanceof yg.x) {
                i6 i6Var = ((yg.x) childAt).f59510r;
                if (f12 <= 0) {
                    G = "";
                } else {
                    G = id.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                }
                i6Var.a();
                i6Var.c(G, true, true);
            }
            if (childAt instanceof yg.g) {
                yg.g gVar = (yg.g) childAt;
                int F = cVar.F(gVar.getChat());
                boolean V = t3.V(gVar.f59463x);
                if (gVar.f59464y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        M0 = id.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i10 = 2131751390;
                        } else {
                            i10 = 2131754876;
                        }
                        M0 = id.M0(i10, null);
                    }
                    gVar.setSubtitle(M0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    gVar.setSubtitle(id.G(f12, str, new Object[0]));
                }
            }
        }
        cVar.g(8);
        cVar.k(cVar.f58721e.size() - 12, 12);
    }

    @Override
    public void n() {
    }
}
