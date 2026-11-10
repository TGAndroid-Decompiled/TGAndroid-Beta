package yg;

import c8.ha;
import di.e4;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
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
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        this.f59441c.setLayoutParams(ha.d(40, 40.0f, i7 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z9 = id.f23161a0;
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
        boolean z10 = id.f23161a0;
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
        this.f59442e.setLayoutParams(ha.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        t6.X(this.f59442e, m6.f28148r5, this.f59439a);
        boolean z9 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        e4 e4Var = this.d;
        v8 v8Var = this.f59440b;
        if (z9) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            v8Var.g(26);
            e4Var.k(id.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(id.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            e4Var.k(id.M0(2131753328, null));
            v8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                v8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                v8Var.i(-10703110, -12481584);
            } else {
                v8Var.i(-6631068, -11945404);
            }
            setSubtitle(id.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", id.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        k9 k9Var = this.f59441c;
        k9Var.setImageDrawable(v8Var);
        k9Var.setRoundRadius(g0.L(20.0f));
    }
}
