package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.zq0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50236a;
    public final Context f50237b;
    public final d6 f50238c;

    public u(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f50236a = starGift;
        this.f50237b = context;
        this.f50238c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50237b;
        TL_stars.StarGift starGift = this.f50236a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.S(context, starGift, this.f50238c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            zq0.K0(context, null, str, false, str).show();
        }
    }
}
