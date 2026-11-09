package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
public final class x implements c20 {
    public final z f57832a;
    public final TL_stories.TL_prepaidStarsGiveaway f57833b;
    public final long f57834c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f57835e;

    public x(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, z zVar) {
        this.f57832a = zVar;
        this.f57833b = tL_prepaidStarsGiveaway;
        this.f57834c = j3;
        this.d = j10;
        this.f57835e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r62 = (Void) obj;
        z zVar = this.f57832a;
        zVar.dismiss();
        if (this.f57833b != null) {
            f2 T = LaunchActivity.T();
            if (T != null) {
                cn ta2 = cn.ta(this.f57834c);
                ta2.whenFullyVisible(new bg.j0(ta2, this.d, 7));
                T.presentFragment(ta2);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.i3(new u9.f(21, zVar, this.f57835e), 220L);
    }
}
