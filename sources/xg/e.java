package xg;

import di.l4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
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
        this.f51763c.setLayoutParams(gb1.h(40, 40.0f, i10 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
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
        this.d.setLayoutParams(gb1.h(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
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
        this.e.setLayoutParams(gb1.h(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        f7.Y(this.e, y6.f23614r5, this.f51761a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        l4 l4Var = this.d;
        j9 j9Var = this.f51762b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            j9Var.g(26);
            l4Var.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            l4Var.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            j9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                j9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                j9Var.i(-10703110, -12481584);
            } else {
                j9Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        y9 y9Var = this.f51763c;
        y9Var.setImageDrawable(j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
