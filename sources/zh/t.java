package zh;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.mo0;
public final class t extends org.telegram.ui.ActionBar.k {
    public final TL_stars.StarGift f60547a;
    public final Context f60548b;
    public final h6 f60549c;

    public t(Context context, TL_stars.StarGift starGift, h6 h6Var) {
        this.f60547a = starGift;
        this.f60548b = context;
        this.f60549c = h6Var;
    }

    @Override
    public final void b(int i7) {
        Context context = this.f60548b;
        TL_stars.StarGift starGift = this.f60547a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                u.g1(context, starGift, this.f60549c);
                return;
            }
            return;
        }
        String str = qp.s1(p10.f24474s0).U2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            mo0.N0(context, null, str, false, str).show();
        }
    }
}
