package zh;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.no0;
public final class t extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f60538a;
    public final Context f60539b;
    public final g6 f60540c;

    public t(Context context, TL_stars.StarGift starGift, g6 g6Var) {
        this.f60538a = starGift;
        this.f60539b = context;
        this.f60540c = g6Var;
    }

    @Override
    public final void b(int i7) {
        Context context = this.f60539b;
        TL_stars.StarGift starGift = this.f60538a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                u.g1(context, starGift, this.f60540c);
                return;
            }
            return;
        }
        String str = qp.s1(p10.f24470s0).U2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            no0.N0(context, null, str, false, str).show();
        }
    }
}
