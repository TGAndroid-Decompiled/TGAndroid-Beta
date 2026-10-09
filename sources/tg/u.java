package tg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.vw0;
public final class u implements f5, vw0, vg.f, vg.k {
    public final a0 f48412a;

    public u(a0 a0Var) {
        this.f48412a = a0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        a0 a0Var = this.f48412a;
        a0Var.m0 = i10 * 1000;
        a0Var.b0(false, true);
    }

    @Override
    public void g(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        a0 a0Var = this.f48412a;
        int i12 = a0Var.f48271h0;
        int i13 = vg.d.v;
        if (i12 == 2) {
            a0Var.f48276n0 = i10;
        } else {
            a0Var.f48277o0 = i10;
        }
        a0Var.f48279q0.f49561a.b(a0Var.W(), true);
        if (a0Var.f48271h0 == 3) {
            a0Var.b0(true, true);
        } else {
            a0Var.b0(false, false);
        }
        ug.b bVar = a0Var.f48270g0;
        int W = a0Var.W();
        for (int i14 = 0; i14 < bVar.f48910f.getChildCount(); i14++) {
            View childAt = bVar.f48910f.getChildAt(i14);
            if (childAt instanceof vg.x) {
                r6 r6Var = ((vg.x) childAt).f49636r;
                if (W <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", W, Integer.valueOf(W));
                }
                r6Var.a();
                r6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof vg.g) {
                vg.g gVar = (vg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.f49592w);
                if (gVar.f49593x) {
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
        bVar.q(bVar.f48909e.size() - 12, 12);
    }

    @Override
    public void l() {
    }
}
