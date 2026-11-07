package wg;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ut0;
public final class u implements t4, ut0, yg.f, yg.k {
    public final a0 f57720a;

    public u(a0 a0Var) {
        this.f57720a = a0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        a0 a0Var = this.f57720a;
        a0Var.f57588e2 = i7 * 1000;
        a0Var.k1(false, true);
    }

    @Override
    public void m(int i7) {
        String str;
        int i10;
        String M0;
        String str2;
        String G;
        a0 a0Var = this.f57720a;
        int i11 = a0Var.Z1;
        int i12 = yg.d.f59357w;
        if (i11 == 2) {
            a0Var.f57589f2 = i7;
        } else {
            a0Var.f57590g2 = i7;
        }
        a0Var.f57592i2.f59328a.c(a0Var.f1(), true);
        if (a0Var.Z1 == 3) {
            a0Var.k1(true, true);
        } else {
            a0Var.k1(false, false);
        }
        xg.c cVar = a0Var.Y1;
        int f12 = a0Var.f1();
        for (int i13 = 0; i13 < cVar.f58625f.getChildCount(); i13++) {
            View childAt = cVar.f58625f.getChildAt(i13);
            if (childAt instanceof yg.x) {
                j6 j6Var = ((yg.x) childAt).f59410r;
                if (f12 <= 0) {
                    G = "";
                } else {
                    G = hd.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                }
                j6Var.a();
                j6Var.c(G, true, true);
            }
            if (childAt instanceof yg.g) {
                yg.g gVar = (yg.g) childAt;
                int F = cVar.F(gVar.getChat());
                boolean V = t3.V(gVar.f59363x);
                if (gVar.f59364y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        M0 = hd.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i10 = 2131751391;
                        } else {
                            i10 = 2131754876;
                        }
                        M0 = hd.M0(i10, null);
                    }
                    gVar.setSubtitle(M0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    gVar.setSubtitle(hd.G(f12, str, new Object[0]));
                }
            }
        }
        cVar.g(8);
        cVar.k(cVar.f58624e.size() - 12, 12);
    }

    @Override
    public void n() {
    }
}
