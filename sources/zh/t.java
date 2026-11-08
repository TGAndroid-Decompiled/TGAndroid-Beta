package zh;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mo0;
public final class t extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f60525a;
    public final Context f60526b;
    public final f6 f60527c;

    public t(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        this.f60525a = starGift;
        this.f60526b = context;
        this.f60527c = f6Var;
    }

    @Override
    public final void b(int i7) {
        Context context = this.f60526b;
        TL_stars.StarGift starGift = this.f60525a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                u.g1(context, starGift, this.f60527c);
                return;
            }
            return;
        }
        String str = qp.s1(p10.f24470s0).U2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            mo0.N0(context, null, str, false, str).show();
        }
    }
}
