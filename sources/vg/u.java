package vg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.zw0;
public final class u implements e5, zw0, xg.f, xg.k {
    public final a0 f50297a;

    public u(a0 a0Var) {
        this.f50297a = a0Var;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        a0 a0Var = this.f50297a;
        a0Var.m0 = i10 * 1000;
        a0Var.a0(false, true);
    }

    @Override
    public void j(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        a0 a0Var = this.f50297a;
        int i12 = a0Var.f50160h0;
        int i13 = xg.d.v;
        if (i12 == 2) {
            a0Var.f50165n0 = i10;
        } else {
            a0Var.f50166o0 = i10;
        }
        a0Var.f50168q0.f51809a.b(a0Var.V(), true);
        if (a0Var.f50160h0 == 3) {
            a0Var.a0(true, true);
        } else {
            a0Var.a0(false, false);
        }
        wg.b bVar = a0Var.f50159g0;
        int V = a0Var.V();
        for (int i14 = 0; i14 < bVar.f51229f.getChildCount(); i14++) {
            View childAt = bVar.f51229f.getChildAt(i14);
            if (childAt instanceof xg.x) {
                s6 s6Var = ((xg.x) childAt).f51880r;
                if (V <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                }
                s6Var.a();
                s6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof xg.g) {
                xg.g gVar = (xg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.f51840w);
                if (gVar.f51841x) {
                    if (F >= 1) {
                        if (isChannelAndNotMegaGroup) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        string = LocaleController.formatPluralString(str2, F, new Object[0]);
                    } else {
                        if (isChannelAndNotMegaGroup) {
                            i11 = R.string.DiscussChannel;
                        } else {
                            i11 = R.string.AccDescrGroup;
                        }
                        string = LocaleController.getString(i11);
                    }
                    gVar.setSubtitle(string);
                } else {
                    if (isChannelAndNotMegaGroup) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    gVar.setSubtitle(LocaleController.formatPluralString(str, V, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override
    public void m() {
    }
}
