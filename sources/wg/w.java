package wg;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import ug.t1;
public final class w implements z10 {
    public final y f59264a;
    public final TL_stories.TL_prepaidStarsGiveaway f59265b;
    public final long f59266c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f59267e;

    public w(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, y yVar) {
        this.f59264a = yVar;
        this.f59265b = tL_prepaidStarsGiveaway;
        this.f59266c = j3;
        this.d = j10;
        this.f59267e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r62 = (Void) obj;
        y yVar = this.f59264a;
        yVar.dismiss();
        if (this.f59265b != null) {
            e2 T = LaunchActivity.T();
            if (T != null) {
                an ua2 = an.ua(this.f59266c);
                ua2.whenFullyVisible(new bg.j0(ua2, this.d, 7));
                T.presentFragment(ua2);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.i3(new t1(10, yVar, this.f59267e), 220L);
    }
}
