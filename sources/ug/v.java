package ug;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.rv0;
public final class v implements d5, rv0, wg.f, wg.k {
    public final b0 f47216a;

    public v(b0 b0Var) {
        this.f47216a = b0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        b0 b0Var = this.f47216a;
        b0Var.m0 = i10 * 1000;
        b0Var.a0(false, true);
    }

    @Override
    public void i(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        b0 b0Var = this.f47216a;
        int i12 = b0Var.f47075h0;
        int i13 = wg.d.f48522s;
        if (i12 == 2) {
            b0Var.f47080n0 = i10;
        } else {
            b0Var.f47081o0 = i10;
        }
        b0Var.f47083q0.f48494a.b(b0Var.V(), true);
        if (b0Var.f47075h0 == 3) {
            b0Var.a0(true, true);
        } else {
            b0Var.a0(false, false);
        }
        vg.b bVar = b0Var.f47074g0;
        int V = b0Var.V();
        for (int i14 = 0; i14 < bVar.f47795f.getChildCount(); i14++) {
            View childAt = bVar.f47795f.getChildAt(i14);
            if (childAt instanceof wg.x) {
                q6 q6Var = ((wg.x) childAt).f48570r;
                if (V <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                }
                q6Var.a();
                q6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof wg.g) {
                wg.g gVar = (wg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.v);
                if (gVar.f48526w) {
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
        bVar.q(bVar.f47794e.size() - 12, 12);
    }

    @Override
    public void l() {
    }
}
