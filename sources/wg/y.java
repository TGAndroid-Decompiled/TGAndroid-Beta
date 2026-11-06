package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class y implements c20 {
    public final a0 f57745a;
    public final TL_stories.TL_prepaidStarsGiveaway f57746b;
    public final long f57747c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f57748e;

    public y(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, a0 a0Var) {
        this.f57745a = a0Var;
        this.f57746b = tL_prepaidStarsGiveaway;
        this.f57747c = j3;
        this.d = j10;
        this.f57748e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f57745a;
        a0Var.dismiss();
        if (this.f57746b != null) {
            f2 T = LaunchActivity.T();
            if (T != null) {
                an ra2 = an.ra(this.f57747c);
                ra2.whenFullyVisible(new bg.j0(ra2, this.d, 7));
                T.presentFragment(ra2);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.i3(new ti.p(25, a0Var, this.f57748e), 220L);
    }
}
