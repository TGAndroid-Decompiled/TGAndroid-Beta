package zg;

import b8.mf;
import ei.e4;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
public final class e extends d {
    @Override
    public final void d() {
        int i3;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i11 = 3;
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        this.f60474c.setLayoutParams(mf.d(40, 40.0f, i3 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = bd.f21784a0;
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
        this.d.setLayoutParams(mf.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = bd.f21784a0;
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
        this.f60475e.setLayoutParams(mf.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        r6.Y(this.f60475e, k6.r5, this.f60472a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        e4 e4Var = this.d;
        u8 u8Var = this.f60473b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            u8Var.g(26);
            e4Var.k(bd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(bd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            e4Var.k(bd.M0(2131753328, null));
            u8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i3 = tL_prepaidGiveaway.months;
            if (i3 == 12) {
                u8Var.i(-31392, -2796986);
            } else if (i3 == 6) {
                u8Var.i(-10703110, -12481584);
            } else {
                u8Var.i(-6631068, -11945404);
            }
            setSubtitle(bd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", bd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        k9 k9Var = this.f60474c;
        k9Var.setImageDrawable(u8Var);
        k9Var.setRoundRadius(g0.L(20.0f));
    }
}
