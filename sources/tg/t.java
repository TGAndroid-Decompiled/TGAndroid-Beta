package tg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.r6;
public final class t implements f5, bx0, vg.f, vg.k {
    public final z f48619a;

    public t(z zVar) {
        this.f48619a = zVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        z zVar = this.f48619a;
        zVar.m0 = i10 * 1000;
        zVar.b0(false, true);
    }

    @Override
    public void g(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        z zVar = this.f48619a;
        int i12 = zVar.f48667h0;
        int i13 = vg.d.v;
        if (i12 == 2) {
            zVar.f48672n0 = i10;
        } else {
            zVar.f48673o0 = i10;
        }
        zVar.f48675q0.f49791a.b(zVar.W(), true);
        if (zVar.f48667h0 == 3) {
            zVar.b0(true, true);
        } else {
            zVar.b0(false, false);
        }
        ug.b bVar = zVar.f48666g0;
        int W = zVar.W();
        for (int i14 = 0; i14 < bVar.f49140f.getChildCount(); i14++) {
            View childAt = bVar.f49140f.getChildAt(i14);
            if (childAt instanceof vg.x) {
                r6 r6Var = ((vg.x) childAt).f49866r;
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
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.f49822w);
                if (gVar.f49823x) {
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
        bVar.q(bVar.f49139e.size() - 12, 12);
    }

    @Override
    public void l() {
    }
}
