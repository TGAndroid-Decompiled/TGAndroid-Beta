package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hr0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50990a;
    public final Context f50991b;
    public final g6 f50992c;

    public u(Context context, TL_stars.StarGift starGift, g6 g6Var) {
        this.f50990a = starGift;
        this.f50991b = context;
        this.f50992c = g6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50991b;
        TL_stars.StarGift starGift = this.f50990a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f50992c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            hr0.S0(context, null, str, false, str).show();
        }
    }
}
