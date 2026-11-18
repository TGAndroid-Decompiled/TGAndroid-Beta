package yg;

import c8.ma;
import fi.u3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
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
        if (gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        this.f61213c.setLayoutParams(ma.d(40, 40.0f, i7 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = gd.f24213a0;
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
        this.d.setLayoutParams(ma.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = gd.f24213a0;
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
        this.f61214e.setLayoutParams(ma.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        u6.X(this.f61214e, n6.f29652r5, this.f61211a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        u3 u3Var = this.d;
        b9 b9Var = this.f61212b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            b9Var.g(26);
            u3Var.k(gd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(gd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            u3Var.k(gd.M0(2131753326, null));
            b9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                b9Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                b9Var.i(-10703110, -12481584);
            } else {
                b9Var.i(-6631068, -11945404);
            }
            setSubtitle(gd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", gd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        q9 q9Var = this.f61213c;
        q9Var.setImageDrawable(b9Var);
        q9Var.setRoundRadius(g0.L(20.0f));
    }
}
