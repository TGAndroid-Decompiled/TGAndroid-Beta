package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hq0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50575a;
    public final Context f50576b;
    public final f6 f50577c;

    public u(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        this.f50575a = starGift;
        this.f50576b = context;
        this.f50577c = f6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50576b;
        TL_stars.StarGift starGift = this.f50575a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f50577c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            hq0.N0(context, null, str, false, str).show();
        }
    }
}
