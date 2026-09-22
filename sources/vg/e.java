package vg;

import ai.a6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.v9;
import w7.y5;
public final class e extends d {
    @Override
    public final void d() {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float f12;
        int i12 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        this.f44628c.setLayoutParams(y5.d(40, 40.0f, i10 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i13 = i11 | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = 69.0f;
        }
        if (z10) {
            f10 = 69.0f;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(y5.d(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        }
        int i14 = i12 | 16;
        if (z11) {
            f11 = 20.0f;
        } else {
            f11 = 69.0f;
        }
        if (z11) {
            f12 = 69.0f;
        } else {
            f12 = 20.0f;
        }
        this.e.setLayoutParams(y5.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.e.setTextColor(j6.v0(j6.f19365r5, this.f44626a));
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        a6 a6Var = this.d;
        g9 g9Var = this.f44627b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            g9Var.g(26);
            a6Var.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            a6Var.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            g9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                g9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                g9Var.i(-10703110, -12481584);
            } else {
                g9Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        v9 v9Var = this.f44628c;
        v9Var.setImageDrawable(g9Var);
        v9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
