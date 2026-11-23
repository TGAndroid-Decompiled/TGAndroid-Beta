package yg;

import c8.na;
import fi.u3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.p9;
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
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        this.f61342c.setLayoutParams(na.d(40, 40.0f, i7 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = gd.f24314a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i12 = i10 | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = 69.0f;
        }
        if (z10) {
            f11 = 69.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(na.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = gd.f24314a0;
        if (z11) {
            i11 = 5;
        }
        int i13 = i11 | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = 69.0f;
        }
        if (z11) {
            f13 = 69.0f;
        } else {
            f13 = 20.0f;
        }
        this.f61343e.setLayoutParams(na.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        u6.X(this.f61343e, n6.f29709r5, this.f61340a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        u3 u3Var = this.d;
        a9 a9Var = this.f61341b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            a9Var.g(26);
            u3Var.k(gd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(gd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            u3Var.k(gd.N0(2131753325, null));
            a9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                a9Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                a9Var.i(-10703110, -12481584);
            } else {
                a9Var.i(-6631068, -11945404);
            }
            setSubtitle(gd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", gd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        p9 p9Var = this.f61342c;
        p9Var.setImageDrawable(a9Var);
        p9Var.setRoundRadius(g0.L(20.0f));
    }
}
