package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xq0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f46523a;
    public final Context f46524b;
    public final d6 f46525c;

    public u(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f46523a = starGift;
        this.f46524b = context;
        this.f46525c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f46524b;
        TL_stars.StarGift starGift = this.f46523a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f46525c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            xq0.N0(context, null, str, false, str).show();
        }
    }
}
