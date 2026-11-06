package yg;

import c8.ha;
import di.d4;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
public final class e extends d {
    @Override
    public final void d() {
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i11 = 3;
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        this.f59336c.setLayoutParams(ha.d(40, 40.0f, i7 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z9 = hd.f22871a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i12 = i10 | 16;
        if (z9) {
            f10 = 20.0f;
        } else {
            f10 = 69.0f;
        }
        if (z9) {
            f11 = 69.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(ha.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z10 = hd.f22871a0;
        if (z10) {
            i11 = 5;
        }
        int i13 = i11 | 16;
        if (z10) {
            f12 = 20.0f;
        } else {
            f12 = 69.0f;
        }
        if (z10) {
            f13 = 69.0f;
        } else {
            f13 = 20.0f;
        }
        this.f59337e.setLayoutParams(ha.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        r6.Y(this.f59337e, k6.f28106r5, this.f59334a);
        boolean z9 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        d4 d4Var = this.d;
        w8 w8Var = this.f59335b;
        if (z9) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            w8Var.g(26);
            d4Var.k(hd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(hd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            d4Var.k(hd.M0(2131753328, null));
            w8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                w8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                w8Var.i(-10703110, -12481584);
            } else {
                w8Var.i(-6631068, -11945404);
            }
            setSubtitle(hd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", hd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        l9 l9Var = this.f59336c;
        l9Var.setImageDrawable(w8Var);
        l9Var.setRoundRadius(g0.L(20.0f));
    }
}
