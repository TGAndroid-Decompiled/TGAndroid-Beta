package ug;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qw0;
public final class s implements b5, qw0, wg.f, wg.k {
    public final y f48199a;

    public s(y yVar) {
        this.f48199a = yVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        y yVar = this.f48199a;
        yVar.m0 = i10 * 1000;
        yVar.a0(false, true);
    }

    @Override
    public void i(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        y yVar = this.f48199a;
        int i12 = yVar.f48246h0;
        int i13 = wg.d.v;
        if (i12 == 2) {
            yVar.f48251n0 = i10;
        } else {
            yVar.f48252o0 = i10;
        }
        yVar.f48254q0.f49388a.b(yVar.V(), true);
        if (yVar.f48246h0 == 3) {
            yVar.a0(true, true);
        } else {
            yVar.a0(false, false);
        }
        vg.b bVar = yVar.f48245g0;
        int V = yVar.V();
        for (int i14 = 0; i14 < bVar.f48795f.getChildCount(); i14++) {
            View childAt = bVar.f48795f.getChildAt(i14);
            if (childAt instanceof wg.x) {
                o6 o6Var = ((wg.x) childAt).f49459r;
                if (V <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                }
                o6Var.a();
                o6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof wg.g) {
                wg.g gVar = (wg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.f49419w);
                if (gVar.f49420x) {
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
