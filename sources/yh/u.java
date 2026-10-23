package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ir0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50991a;
    public final Context f50992b;
    public final g6 f50993c;

    public u(Context context, TL_stars.StarGift starGift, g6 g6Var) {
        this.f50991a = starGift;
        this.f50992b = context;
        this.f50993c = g6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50992b;
        TL_stars.StarGift starGift = this.f50991a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f50993c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            ir0.S0(context, null, str, false, str).show();
        }
    }
}
