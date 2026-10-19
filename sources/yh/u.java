package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.er0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50525a;
    public final Context f50526b;
    public final d6 f50527c;

    public u(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f50525a = starGift;
        this.f50526b = context;
        this.f50527c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50526b;
        TL_stars.StarGift starGift = this.f50525a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.V(context, starGift, this.f50527c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            er0.P0(context, null, str, false, str).show();
        }
    }
}
