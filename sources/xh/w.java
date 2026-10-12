package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.sr0;
public final class w extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f51792a;
    public final Context f51793b;
    public final c6 f51794c;

    public w(Context context, TL_stars.StarGift starGift, c6 c6Var) {
        this.f51792a = starGift;
        this.f51793b = context;
        this.f51794c = c6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f51793b;
        TL_stars.StarGift starGift = this.f51792a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                x.V(context, starGift, this.f51794c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            sr0.O0(context, null, str, false, str).show();
        }
    }
}
