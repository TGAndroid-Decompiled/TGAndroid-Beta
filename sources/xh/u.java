package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.uq0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f46401a;
    public final Context f46402b;
    public final d6 f46403c;

    public u(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f46401a = starGift;
        this.f46402b = context;
        this.f46403c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f46402b;
        TL_stars.StarGift starGift = this.f46401a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f46403c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            uq0.N0(context, null, str, false, str).show();
        }
    }
}
