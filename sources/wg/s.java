package wg;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.vt0;
public final class s implements r4, vt0, yg.f, yg.k {
    public final y f59235a;

    public s(y yVar) {
        this.f59235a = yVar;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        y yVar = this.f59235a;
        yVar.f59280i2 = i7 * 1000;
        yVar.k1(false, true);
    }

    @Override
    public void l(int i7) {
        String str;
        int i10;
        String M0;
        String str2;
        String G;
        y yVar = this.f59235a;
        int i11 = yVar.d2;
        int i12 = yg.d.f60661w;
        if (i11 == 2) {
            yVar.f59281j2 = i7;
        } else {
            yVar.f59282k2 = i7;
        }
        yVar.f59284m2.f60632a.c(yVar.f1(), true);
        if (yVar.d2 == 3) {
            yVar.k1(true, true);
        } else {
            yVar.k1(false, false);
        }
        xg.b bVar = yVar.f59275c2;
        int f12 = yVar.f1();
        for (int i13 = 0; i13 < bVar.f59904f.getChildCount(); i13++) {
            View childAt = bVar.f59904f.getChildAt(i13);
            if (childAt instanceof yg.x) {
                h6 h6Var = ((yg.x) childAt).f60714r;
                if (f12 <= 0) {
                    G = "";
                } else {
                    G = hd.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                }
                h6Var.a();
                h6Var.c(G, true, true);
            }
            if (childAt instanceof yg.g) {
                yg.g gVar = (yg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean V = t3.V(gVar.f60667x);
                if (gVar.f60668y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        M0 = hd.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i10 = 2131751390;
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
        bVar.g(8);
        bVar.k(bVar.f59903e.size() - 12, 12);
    }

    @Override
    public void p() {
    }
}
