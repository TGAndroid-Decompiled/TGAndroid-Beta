package wg;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class y implements x10 {
    public final a0 f59855a;
    public final TL_stories.TL_prepaidStarsGiveaway f59856b;
    public final long f59857c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f59858e;

    public y(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, a0 a0Var) {
        this.f59855a = a0Var;
        this.f59856b = tL_prepaidStarsGiveaway;
        this.f59857c = j3;
        this.d = j10;
        this.f59858e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f59855a;
        a0Var.dismiss();
        if (this.f59856b != null) {
            h2 T = LaunchActivity.T();
            if (T != null) {
                bn ua2 = bn.ua(this.f59857c);
                ua2.whenFullyVisible(new bg.k0(ua2, this.d, 7));
                T.presentFragment(ua2);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.h3(new r(2, a0Var, this.f59858e), 220L);
    }
}
