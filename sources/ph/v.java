package ph;

import android.content.Context;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.pp0;
public final class v extends org.telegram.ui.ActionBar.k {
    public final TL_stars.StarGift f45335a;
    public final Context f45336b;
    public final p6 f45337c;

    public v(Context context, TL_stars.StarGift starGift, p6 p6Var) {
        this.f45335a = starGift;
        this.f45336b = context;
        this.f45337c = p6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f45336b;
        TL_stars.StarGift starGift = this.f45335a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                w.g1(context, starGift, this.f45337c);
                return;
            }
            return;
        }
        String str = wp.r1(e20.f15506s0).U2 + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            org.telegram.messenger.i0.g(str);
        } else {
            pp0.N0(context, null, str, false, str).show();
        }
    }
}
