package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.fr0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50530a;
    public final Context f50531b;
    public final d6 f50532c;

    public u(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f50530a = starGift;
        this.f50531b = context;
        this.f50532c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50531b;
        TL_stars.StarGift starGift = this.f50530a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.V(context, starGift, this.f50532c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            fr0.P0(context, null, str, false, str).show();
        }
    }
}
