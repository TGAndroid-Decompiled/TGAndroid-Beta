package ph;

import android.content.Context;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.op0;
public final class v extends org.telegram.ui.ActionBar.k {
    public final TL_stars.StarGift f45324a;
    public final Context f45325b;
    public final p6 f45326c;

    public v(Context context, TL_stars.StarGift starGift, p6 p6Var) {
        this.f45324a = starGift;
        this.f45325b = context;
        this.f45326c = p6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f45325b;
        TL_stars.StarGift starGift = this.f45324a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                w.g1(context, starGift, this.f45326c);
                return;
            }
            return;
        }
        String str = vp.r1(d20.f15147s0).U2 + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            org.telegram.messenger.i0.g(str);
        } else {
            op0.N0(context, null, str, false, str).show();
        }
    }
}
