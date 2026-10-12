package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.sr0;
public final class w extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f51800a;
    public final Context f51801b;
    public final c6 f51802c;

    public w(Context context, TL_stars.StarGift starGift, c6 c6Var) {
        this.f51800a = starGift;
        this.f51801b = context;
        this.f51802c = c6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f51801b;
        TL_stars.StarGift starGift = this.f51800a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                x.V(context, starGift, this.f51802c);
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
