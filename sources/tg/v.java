package tg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sv0;
public final class v implements b5, sv0, vg.f, vg.k {
    public final b0 f43229a;

    public v(b0 b0Var) {
        this.f43229a = b0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        b0 b0Var = this.f43229a;
        b0Var.m0 = i10 * 1000;
        b0Var.a0(false, true);
    }

    @Override
    public void g(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        b0 b0Var = this.f43229a;
        int i12 = b0Var.f43095h0;
        int i13 = vg.d.f44322s;
        if (i12 == 2) {
            b0Var.f43100n0 = i10;
        } else {
            b0Var.f43101o0 = i10;
        }
        b0Var.f43103q0.f44297a.b(b0Var.V(), true);
        if (b0Var.f43095h0 == 3) {
            b0Var.a0(true, true);
        } else {
            b0Var.a0(false, false);
        }
        ug.b bVar = b0Var.f43094g0;
        int V = b0Var.V();
        for (int i14 = 0; i14 < bVar.f43710f.getChildCount(); i14++) {
            View childAt = bVar.f43710f.getChildAt(i14);
            if (childAt instanceof vg.x) {
                n6 n6Var = ((vg.x) childAt).f44365r;
                if (V <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                }
                n6Var.a();
                n6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof vg.g) {
                vg.g gVar = (vg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.v);
                if (gVar.f44326w) {
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
    public void l() {
    }
}
