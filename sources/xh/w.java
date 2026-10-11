package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.nr0;
public final class w extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f51692a;
    public final Context f51693b;
    public final d6 f51694c;

    public w(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f51692a = starGift;
        this.f51693b = context;
        this.f51694c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f51693b;
        TL_stars.StarGift starGift = this.f51692a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                x.V(context, starGift, this.f51694c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            nr0.O0(context, null, str, false, str).show();
        }
    }
}
