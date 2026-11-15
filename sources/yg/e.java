package yg;

import c8.ja;
import fi.w3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
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
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        this.f60645c.setLayoutParams(ja.d(40, 40.0f, i7 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = hd.f24101a0;
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
        this.d.setLayoutParams(ja.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = hd.f24101a0;
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
        this.f60646e.setLayoutParams(ja.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        q6.X(this.f60646e, j6.f29107r5, this.f60643a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        w3 w3Var = this.d;
        t8 t8Var = this.f60644b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            t8Var.g(26);
            w3Var.k(hd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(hd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            w3Var.k(hd.M0(2131753328, null));
            t8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                t8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                t8Var.i(-10703110, -12481584);
            } else {
                t8Var.i(-6631068, -11945404);
            }
            setSubtitle(hd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", hd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        i9 i9Var = this.f60645c;
        i9Var.setImageDrawable(t8Var);
        i9Var.setRoundRadius(g0.L(20.0f));
    }
}
