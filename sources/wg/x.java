package wg;

import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class x implements w10 {
    public final z f59960a;
    public final TL_stories.TL_prepaidStarsGiveaway f59961b;
    public final long f59962c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f59963e;

    public x(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, z zVar) {
        this.f59960a = zVar;
        this.f59961b = tL_prepaidStarsGiveaway;
        this.f59962c = j3;
        this.d = j10;
        this.f59963e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r62 = (Void) obj;
        z zVar = this.f59960a;
        zVar.dismiss();
        if (this.f59961b != null) {
            g2 T = LaunchActivity.T();
            if (T != null) {
                bn ua2 = bn.ua(this.f59962c);
                ua2.whenFullyVisible(new bg.k0(ua2, this.d, 7));
                T.presentFragment(ua2);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.h3(new v9.b(8, zVar, this.f59963e), 220L);
    }
}
