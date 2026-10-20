package ug;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.q6;
public final class t implements e5, ow0, wg.f, wg.k {
    public final z f47763a;

    public t(z zVar) {
        this.f47763a = zVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        z zVar = this.f47763a;
        zVar.m0 = i10 * 1000;
        zVar.b0(false, true);
    }

    @Override
    public void h(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        z zVar = this.f47763a;
        int i12 = zVar.f47810h0;
        int i13 = wg.d.v;
        if (i12 == 2) {
            zVar.f47815n0 = i10;
        } else {
            zVar.f47816o0 = i10;
        }
        zVar.f47818q0.f48947a.b(zVar.W(), true);
        if (zVar.f47810h0 == 3) {
            zVar.b0(true, true);
        } else {
            zVar.b0(false, false);
        }
        vg.b bVar = zVar.f47809g0;
        int W = zVar.W();
        for (int i14 = 0; i14 < bVar.f48354f.getChildCount(); i14++) {
            View childAt = bVar.f48354f.getChildAt(i14);
            if (childAt instanceof wg.x) {
                q6 q6Var = ((wg.x) childAt).f49014r;
                if (W <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", W, Integer.valueOf(W));
                }
                q6Var.a();
                q6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof wg.g) {
                wg.g gVar = (wg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.f48975w);
                if (gVar.f48976x) {
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
