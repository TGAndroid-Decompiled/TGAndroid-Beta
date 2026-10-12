package wg;

import bi.l5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.a6;
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
        this.f47567c.setLayoutParams(a6.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, 40, i10 | 16));
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
        this.d.setLayoutParams(a6.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, i13));
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
        this.e.setLayoutParams(a6.a(-2.0f, f11, 0.0f, f12, 0.0f, -1, i14));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.e.setTextColor(g6.w0(g6.f20157r5, this.f47565a));
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        l5 l5Var = this.d;
        k9 k9Var = this.f47566b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            k9Var.g(26);
            l5Var.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            l5Var.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            k9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                k9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                k9Var.i(-10703110, -12481584);
            } else {
                k9Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        z9 z9Var = this.f47567c;
        z9Var.setImageDrawable(k9Var);
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
