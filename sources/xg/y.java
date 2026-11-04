package xg;

import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class y implements u10 {
    public final a0 f58789a;
    public final TL_stories.TL_prepaidStarsGiveaway f58790b;
    public final long f58791c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f58792e;

    public y(long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, a0 a0Var) {
        this.f58789a = a0Var;
        this.f58790b = tL_prepaidStarsGiveaway;
        this.f58791c = j10;
        this.d = j11;
        this.f58792e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f58789a;
        a0Var.dismiss();
        if (this.f58790b != null) {
            d2 T = LaunchActivity.T();
            if (T != null) {
                wm ra2 = wm.ra(this.f58791c);
                ra2.whenFullyVisible(new cg.i0(ra2, this.d, 7));
                T.presentFragment(ra2);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.i3(new u9.a(28, a0Var, this.f58792e), 220L);
    }
}
