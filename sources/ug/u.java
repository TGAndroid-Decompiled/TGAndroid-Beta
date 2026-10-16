package ug;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.s6;
public final class u implements f5, rw0, wg.f, wg.k {
    public final a0 f46394a;

    public u(a0 a0Var) {
        this.f46394a = a0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        a0 a0Var = this.f46394a;
        a0Var.m0 = i10 * 1000;
        a0Var.b0(false, true);
    }

    @Override
    public void h(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        a0 a0Var = this.f46394a;
        int i12 = a0Var.f46260h0;
        int i13 = wg.d.v;
        if (i12 == 2) {
            a0Var.f46265n0 = i10;
        } else {
            a0Var.f46266o0 = i10;
        }
        a0Var.f46268q0.f47554a.b(a0Var.W(), true);
        if (a0Var.f46260h0 == 3) {
            a0Var.b0(true, true);
        } else {
            a0Var.b0(false, false);
        }
        vg.b bVar = a0Var.f46259g0;
        int W = a0Var.W();
        for (int i14 = 0; i14 < bVar.f46962f.getChildCount(); i14++) {
            View childAt = bVar.f46962f.getChildAt(i14);
            if (childAt instanceof wg.x) {
                s6 s6Var = ((wg.x) childAt).f47621r;
                if (W <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", W, Integer.valueOf(W));
                }
                s6Var.a();
                s6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof wg.g) {
                wg.g gVar = (wg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.f47582w);
                if (gVar.f47583x) {
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
                    gVar.setSubtitle(LocaleController.formatPluralString(str, W, new Object[0]));
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
