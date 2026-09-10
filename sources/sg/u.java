package sg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.o6;
public final class u implements c5, dw0, ug.f, ug.k {
    public final a0 f42009a;

    public u(a0 a0Var) {
        this.f42009a = a0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        a0 a0Var = this.f42009a;
        a0Var.m0 = i10 * 1000;
        a0Var.a0(false, true);
    }

    @Override
    public void h(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        a0 a0Var = this.f42009a;
        int i12 = a0Var.f41853h0;
        int i13 = ug.d.f42690s;
        if (i12 == 2) {
            a0Var.f41858n0 = i10;
        } else {
            a0Var.f41859o0 = i10;
        }
        a0Var.f41861q0.f42665a.b(a0Var.V(), true);
        if (a0Var.f41853h0 == 3) {
            a0Var.a0(true, true);
        } else {
            a0Var.a0(false, false);
        }
        tg.b bVar = a0Var.f41852g0;
        int V = a0Var.V();
        for (int i14 = 0; i14 < bVar.f42145f.getChildCount(); i14++) {
            View childAt = bVar.f42145f.getChildAt(i14);
            if (childAt instanceof ug.x) {
                o6 o6Var = ((ug.x) childAt).f42733r;
                if (V <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                }
                o6Var.a();
                o6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof ug.g) {
                ug.g gVar = (ug.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.v);
                if (gVar.f42694w) {
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
