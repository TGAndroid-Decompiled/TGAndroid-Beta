package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.or0;
public final class w extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f51658a;
    public final Context f51659b;
    public final d6 f51660c;

    public w(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f51658a = starGift;
        this.f51659b = context;
        this.f51660c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f51659b;
        TL_stars.StarGift starGift = this.f51658a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                x.V(context, starGift, this.f51660c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            or0.O0(context, null, str, false, str).show();
        }
    }
}
